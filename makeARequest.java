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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Image;
import javax.swing.ImageIcon;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.util.Iterator;




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
public class makeARequest extends javax.swing.JFrame {
	public JTextField text;

	private JButton jButton1;
	private JLabel jLabelRequestTitle;
	private JLabel jLabelDetails;
	private JButton enter;
	private JLabel jLabelUserLogedIn;
	private JLabel jTextFieldULI;
	
	private String userN="";
	private JLabel Img;
	private String exceed = ""; 

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default make req page";
				makeARequest inst = new makeARequest(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public makeARequest(String UN) {
		super();
		initGUI();
		
		{
			text = new JTextField();
			getContentPane().add(text);
			text.setText("");
			text.setBounds(107, 121, 235, 34);
		}
		
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(142, 286, 217, 23);
		jTextFieldULI.setText(UN);
		actionHittingRequest();
		actionGoToMainMenuWhenClickCancel();
	}
	
	public makeARequest(String UN, String RT) {
		super();
		initGUI();
		this.userN=UN;
		this.exceed=RT;
		text = new JTextField();
		getContentPane().add(text);
		text.setText(RT);
		text.setBounds(107, 121, 235, 34);
		
		
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(142, 286, 217, 23);
		jTextFieldULI.setText(UN);
		actionHittingRequest();
		actionGoToMainMenuWhenClickCancel();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			{
				enter = new JButton();
				getContentPane().add(enter);
				enter.setText("Request");
				enter.setBounds(90, 211, 86, 32);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Cancel");
				jButton1.setBounds(215, 211, 80, 32);
			}
			{
				jLabelDetails = new JLabel();
				getContentPane().add(jLabelDetails);
				jLabelDetails.setText("Details");
				jLabelDetails.setBounds(12, 128, 67, 16);
			}
			{
				jLabelRequestTitle = new JLabel();
				getContentPane().add(jLabelRequestTitle);
				jLabelRequestTitle.setText("Request a resource");
				jLabelRequestTitle.setBounds(132, 86, 163, 16);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User logged in as ");
				jLabelUserLogedIn.setBounds(19, 289, 113, 16);
			}
			{
				Img = new JLabel();
				getContentPane().add(Img);
				Img.setText("");
				Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
				Img.setIcon(new ImageIcon(img));
				Img.setBounds(96, 12, 187, 53);
			}
			pack();
			setSize(400, 400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void actionHittingRequest() 
	{
		
		
		enter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				String requestText = text.getText();
				String userWhoMadeRequest = userN;
				
				
				InputStream MakeRequestExcelSheet = null;
				try {
					MakeRequestExcelSheet = new FileInputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\makeRequestSheet.xls");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				HSSFWorkbook wbMrqes = null;
				try {
					wbMrqes = new HSSFWorkbook(MakeRequestExcelSheet);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				HSSFSheet sheet = wbMrqes.getSheetAt(0);
				int lr = sheet.getLastRowNum();
				System.out.println("last row num "+lr);
				Iterator cellIterator = sheet.rowIterator();
				
				if(cellIterator.hasNext())
				{
					HSSFRow row_UN = sheet.createRow(lr+1);
					HSSFCell col_UN=row_UN.createCell((short)1);// to get column number

					HSSFRow row_text = sheet.getRow(lr+1);// to get row number
					HSSFCell col_text =row_text.createCell((short) 2);
					col_UN.setCellType(HSSFCell.CELL_TYPE_STRING);
					col_text.setCellType(HSSFCell.CELL_TYPE_STRING);
					col_UN.setCellValue(userWhoMadeRequest);// to get the value
					col_text.setCellValue(requestText);
					
				}
				//all together..
				//String value = sheet.getRow(4).getCell((short) 2).getStringCellValue();
				
				
				
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\makeRequestSheet.xls");
					wbMrqes.write(fos);
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
				
				
				
				//String value = sheet.getRow(ROW NUMBER).getCell((short) (COLUMN NUMBER-1)).getStringCellValue();
				requestProcessed regFace =new requestProcessed(userN);
				regFace.setVisible(true);
				dispose();
		 					
			
				
				

		
			}
		});
		
	}// end of action make request

	public void actionGoToMainMenuWhenClickCancel() 
	{
		
		
		jButton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ServicesList regFace =new ServicesList(userN);
 				
 				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action cancel
	

}
