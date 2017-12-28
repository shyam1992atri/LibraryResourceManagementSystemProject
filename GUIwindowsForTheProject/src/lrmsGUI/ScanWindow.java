package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ScanWindow extends javax.swing.JFrame {
	private JLabel jLabelTitleForThisWindow;
	private JButton jButtonLogOut;
	private JButton jButtonCancel;
	private JButton jButtonScan;
	private JLabel jTextFieldULI;
	private JLabel jLabelUserLogedIn;
	private String userN="";
	private JLabel Img;
	
	public static void main(String[] args) 
	{SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			String S1 = "default Scan Window Default page";
			ScanWindow inst = new ScanWindow(S1);
			inst.setLocationRelativeTo(null);
			inst.setVisible(true);
		}
	});
	}
	
	public ScanWindow(String p) {
		super();
		initGUI();
		this.userN=p;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(142, 286, 217, 23);
		jTextFieldULI.setText(p);
		initGUI();
		actionLogOut();
		actionScan();
		actionCancel();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelTitleForThisWindow = new JLabel();
				getContentPane().add(jLabelTitleForThisWindow);
				jLabelTitleForThisWindow.setText("Place the resource under Scanner");
				jLabelTitleForThisWindow.setBounds(81, 79, 254, 16);
			}
			{
				jButtonScan = new JButton();
				getContentPane().add(jButtonScan);
				jButtonScan.setText("Scan");
				jButtonScan.setBounds(52, 120, 245, 23);
			}
			{
				jButtonCancel = new JButton();
				getContentPane().add(jButtonCancel);
				jButtonCancel.setText("Cancel");
				jButtonCancel.setBounds(52, 172, 245, 23);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("Log Out");
				jButtonLogOut.setBounds(52, 231, 245, 23);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Logged In as ");
				jLabelUserLogedIn.setBounds(40, 289, 102, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(81, 5, 185, 57);
			}
			pack();
			setSize(400, 400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionScan() 
	{
		jButtonScan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				InputStream ExcelFileToRead = null;
				try {
						ExcelFileToRead = new FileInputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\test1.xls");
					} 
				catch (FileNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				HSSFWorkbook wb = null;
				try {
						wb = new HSSFWorkbook(ExcelFileToRead);
					
					} 
				catch (IOException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				HSSFSheet sheet = wb.getSheetAt(0);
				
				HSSFRow row = sheet.getRow(2);// to get row number
				
				int lr = sheet.getLastRowNum();
				int lc = 2;
				//System.out.println("last col num "+lc);
				//String value = sheet.getRow(ROW NUMBER).getCell((short) (COLUMN NUMBER-1)).getStringCellValue();
		 	
				for(int j=2;j<lr+1;j++)
		 		{
			 		String userName = sheet.getRow(j).getCell((short) 1).getStringCellValue();
			 		
			 		
			 		if(userName.equals(userN) )
			 		{
			 			double fineAmount = sheet.getRow(j).getCell((short) 15).getNumericCellValue();
			 			System.out.println("fine amt is "+fineAmount);
			 			break;
			 		}
			 		
		 		}// closing for loop
				
				
			}
		});
		
	}// end of action Scan
	public void actionCancel() 
	{
		
		
		jButtonCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ServicesList regFace =new ServicesList(userN);
 				
 				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action cancel

	
	public void actionLogOut() 
	{
		
		
		jButtonLogOut.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				LogInPage regFace =new LogInPage();
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action log out


}
