package lrmsGUI;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFCell;
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
public class LogInPage extends javax.swing.JFrame 
{
	private JLabel labelUserID;
	private JLabel Img;
	private JLabel labelPassword;
	private JButton jButtonForLogIN;
	private JPasswordField PasswordFieldForLogIN;
	private JTextField jTextFieldLogINemailID;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				LogInPage inst = new LogInPage();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public LogInPage() 
	{
		super();
		initGUI();
		actionlogin();
	}
	
	private void initGUI() 
	{
		try {
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				getContentPane().setLayout(null);
			{
				labelUserID = new JLabel();
				getContentPane().add(labelUserID);
				labelUserID.setText("User ID");
				labelUserID.setBounds(17, 77, 91, 16);
			}
			{
				jTextFieldLogINemailID = new JTextField();
				getContentPane().add(jTextFieldLogINemailID);
				jTextFieldLogINemailID.setText("");
				jTextFieldLogINemailID.setBounds(138, 74, 295, 23);
			}
			{
				labelPassword = new JLabel();
				getContentPane().add(labelPassword);
				labelPassword.setText("Password");
				labelPassword.setBounds(17, 119, 96, 16);
			}
			{
				PasswordFieldForLogIN = new JPasswordField();
				getContentPane().add(PasswordFieldForLogIN);
				PasswordFieldForLogIN.setBounds(138, 116, 290, 23);
			}
			{
				jButtonForLogIN = new JButton();
				getContentPane().add(jButtonForLogIN);
				jButtonForLogIN.setText("LogIN");
				jButtonForLogIN.setBounds(138, 181, 82, 23);
			}
			{
				Img = new JLabel();
				getContentPane().add(Img);
				Img.setText("");
				Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
				Img.setIcon(new ImageIcon(img));
				Img.setBounds(155, 5, 185, 58);
			}
			
			pack();
			setSize(500, 300);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}// end of initGUI
	

	
public void actionlogin() 
	{
		
		jButtonForLogIN.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				String puname = jTextFieldLogINemailID.getText();
				String ppaswd = PasswordFieldForLogIN.getText();
				
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
				
		 	

		 		int flag =1;
				for(int j=2;j<lr+1;j++)
		 		{
			 		String userName = sheet.getRow(j).getCell((short) 1).getStringCellValue();
			 		String pass = sheet.getRow(j).getCell((short) 2).getStringCellValue();
			 		String TuserName="";
			 		String Tpass = "";
			 		//System.out.println(puname+" pun");
			 		//System.out.println(userName);
			 		
			 		if(puname.equals(userName) && ppaswd.equals(pass))
			 		{
			 			TuserName = userName;
			 			Tpass = pass;
			 			System.out.println(TuserName );
			 			System.out.println(Tpass );
			 			if(puname.equals(TuserName) && ppaswd.equals(Tpass)) 
						{
			 				ServicesList regFace =new ServicesList(puname);
			 				
			 				regFace.setVisible(true);
							dispose();
							flag--;
							
							break;
						} 
			 			
			 		}
			 		
		 		}// closing for loop
		 		if(flag==1)
		 		{
		 			JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					jTextFieldLogINemailID.setText("");
					PasswordFieldForLogIN.setText("");
					jTextFieldLogINemailID.requestFocus();
		 		}
	
			}
		});
		
	}// end of action log in

}
