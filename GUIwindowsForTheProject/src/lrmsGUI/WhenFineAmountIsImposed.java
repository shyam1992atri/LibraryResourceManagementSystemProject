package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
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
public class WhenFineAmountIsImposed extends javax.swing.JFrame {
	private JLabel jLabelFineAmount;
	private JLabel jLabelPleasePayMessage;
	private JButton jButtonLogOut;
	
	//private JButton jButtonToCancel;
	private JButton jButtonPay;
	private JLabel jLabelToDisplayAmount;
	private JLabel jTextFieldULI;
	private JLabel jLabel1;
	private double fineA=0.0;
	private String userN="";
	private JLabel jLabelUserLogedIn;
	private JButton jButtonCancel;
	private JLabel Img;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "fine imposed page";
				double d1=0.0;
				WhenFineAmountIsImposed inst = new WhenFineAmountIsImposed(S1,d1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public WhenFineAmountIsImposed(String UN, double fine) {
		super();
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(154, 288, 173, 26);
		jTextFieldULI.setText(UN);
		
		jLabelToDisplayAmount = new JLabel();
		getContentPane().add(jLabelToDisplayAmount);
		jLabelToDisplayAmount.setBounds(177, 119, 87, 19);
		String fineString = Double.toString(fine);
		jLabelToDisplayAmount.setText(fineString);
		
		initGUI();
		actionPay();
		actionCancel();
		actionLogOut();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelFineAmount = new JLabel();
				getContentPane().add(jLabelFineAmount);
				jLabelFineAmount.setText("Fine Amount ($):");
				jLabelFineAmount.setBounds(52, 118, 102, 23);
			}
			
			{
				jLabelPleasePayMessage = new JLabel();
				getContentPane().add(jLabelPleasePayMessage);
				jLabelPleasePayMessage.setText("Please pay the fine");
				jLabelPleasePayMessage.setBounds(110, 94, 174, 17);
			}
			{
				jButtonPay = new JButton();
				getContentPane().add(jButtonPay);
				jButtonPay.setText("Pay");
				jButtonPay.setBounds(40, 157, 253, 23);
			}
			/*{
				jButtonToCancel = new JButton();
				getContentPane().add(jButtonToCancel);
				jButtonToCancel.setText("Cancel");
				jButtonToCancel.setBounds(61, 166, 253, 23);
			}*/
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Loged In as ");
				jLabelUserLogedIn.setBounds(40, 289, 102, 24);
			}
			{
				jButtonCancel = new JButton();
				getContentPane().add(jButtonCancel);
				jButtonCancel.setText("Cancel");
				jButtonCancel.setBounds(40, 207, 253, 23);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("Log Out");
				jButtonLogOut.setBounds(40, 255, 253, 23);
			}


			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(71, 10, 176, 63);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("You have outstanding balance!");
				jLabel1.setBounds(76, 79, 188, 16);
			}

			pack();
			setSize(350, 450);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPay() 
	{
		jButtonPay.addActionListener(new ActionListener() 
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
			 			double zer = 0;
			 			sheet.createRow(j).createCell((short) 15).setCellValue(zer);
			 			WhenNoFineIsAdded regFace =new WhenNoFineIsAdded(userN);
						regFace.setVisible(true);
						dispose();
			 			
			 		}
			 		
		 		}// closing for loop
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\test1.xls");
					wb.write(fos);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
