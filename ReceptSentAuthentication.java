package lrmsGUI;
import java.awt.Image;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
public class ReceptSentAuthentication extends javax.swing.JFrame {
	private JLabel jLabelMessege;
	private JLabel jLabelRTFromExcel;
	private JLabel jLabelAuthor;
	private JLabel jLabelResourceAuthor;
	private JLabel jLabelTitle;
	private JLabel jLabelResourceTitle;
	private JLabel jLabel1ResourceType;
	private JButton jButtonLogOut;
	private JButton jButtonToGoToMainMenu;
	private JLabel jLabelUserLogedIn;
	private JLabel jTextFieldULI;

	private JLabel Img;
	private String userN="";

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default recept sent page";
				ReceptSentAuthentication inst = new ReceptSentAuthentication(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ReceptSentAuthentication(String UN) {
		super();
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(181, 358, 217, 23);
		jTextFieldULI.setText(UN);
		initGUI();
		
		InputStream MakeRequestExcelSheet = null;
		InputStream userDb = null;
		try {
			MakeRequestExcelSheet = new FileInputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\ResourcesDataBase.xls");
			userDb = new FileInputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\test1.xls");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HSSFWorkbook wbrdb = null;
		HSSFWorkbook udb = null;
		try {
			wbrdb = new HSSFWorkbook(MakeRequestExcelSheet);
			udb = new HSSFWorkbook(userDb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// Here write the functionality
		HSSFSheet sheet = wbrdb.getSheetAt(0);
		HSSFSheet sheetudb = udb.getSheetAt(0);
		int lr = sheet.getLastRowNum();
		int lrudb = sheetudb.getLastRowNum();
		System.out.println("last row num "+lr);
		HSSFRow row = null;
		HSSFCell col=null;// to get column number
		
		Random r = new Random();
		int Low = 8;
		int High = 32;
		int Result = r.nextInt(High-Low) + Low;
		String availablity = sheet.getRow(Result).getCell((short) 10).getStringCellValue();
		do
			{
				
				if(availablity.equals("AV"))
				{
					break;
				}
				else
				{
					r = new Random();
					Result = r.nextInt(High-Low) + Low;
					availablity = sheet.getRow(Result).getCell((short) 10).getStringCellValue();
				}
			}
		while(availablity.equals("AV"));
		
		
		//System.out.println(Result);
		
		
		
		
		
		String resourceType = sheet.getRow(Result).getCell((short) 6).getStringCellValue();
 		String resourceTitle = sheet.getRow(Result).getCell((short) 8).getStringCellValue();
 		//double resourceID = sheet.getRow(Result).getCell((short) 7).getNumericCellValue();
 		String author = sheet.getRow(Result).getCell((short) 9).getStringCellValue();
 		
 		{
			jLabelTitle = new JLabel();
			getContentPane().add(jLabelTitle);
			jLabelTitle.setText("Title");
			jLabelTitle.setBounds(187, 261, 428, 16);
		}
 		{
			jLabelAuthor = new JLabel();
			getContentPane().add(jLabelAuthor);
			jLabelAuthor.setText("Author");
			jLabelAuthor.setBounds(187, 302, 428, 23);
		}
 		{
			jLabelRTFromExcel = new JLabel();
			getContentPane().add(jLabelRTFromExcel);
			jLabelRTFromExcel.setText("text");
			jLabelRTFromExcel.setBounds(187, 216, 428, 16);
		}
 		//String availablity = sheet.getRow(Result).getCell((short) 10).getStringCellValue();
 		System.out.println(availablity);
 		if(availablity.equals("AV"))
 		{
 			jLabelRTFromExcel.setText(resourceType);
 	 		jLabelTitle.setText(resourceTitle);
 	 		jLabelAuthor.setText(author);
 	 		availablity = "NA";
 	 		sheet.getRow(Result).getCell((short) 10).setCellValue(availablity);
 	 		
 	 		/*for(int i=2;i<lrudb;i++)
 	 		{
 	 			String userWhoHasLogedIN=this.userN;
 	 			String userName = sheetudb.getRow(i).getCell((short) 1).getStringCellValue();
 	 			//System.out.println(userName+"1234567890");
 	 			System.out.println(userWhoHasLogedIN+"1234567890");
 	 			if(userWhoHasLogedIN.equals("jack@usc.edu"))
 	 			{
 	 				System.out.println(userWhoHasLogedIN+" this is the user");
 	 			}
 	 			
 	 			if(UN.equals(userNameWhoHasLogedIn))
 	 				{
 	 				HSSFRow row_RI = sheetudb.createRow(lrudb+1);
					HSSFCell col_RI=row_RI.createCell((short)9);
					
					HSSFRow row_ID = sheetudb.createRow(lrudb+1);
					HSSFCell col_ID=row_ID.createCell((short)8);
					
					col_RI.setCellType(HSSFCell.CELL_TYPE_STRING);
					col_RI.setCellValue(resourceTitle);
					col_ID.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
					//col_ID.setCellValue(resourceID);
 	 				}
 	 		}*/
 		}
 		else
 		{
 			scannerMessageForCheckOut regFace =new scannerMessageForCheckOut(userN);
			regFace.setVisible(true);
			dispose();
 		}
 		
		FileOutputStream fos = null;
		FileOutputStream fos1 = null;
		try {
			fos = new FileOutputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\ResourcesDataBase.xls");
			wbrdb.write(fos);
			fos1 = new FileOutputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\test1.xls");
			udb.write(fos1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
			fos1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		actionGoToMainMenu();
		actionLogOut();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelMessege = new JLabel();
				getContentPane().add(jLabelMessege);
				jLabelMessege.setText("Your receipt has been sent to your email account");
				jLabelMessege.setBounds(114, 97, 329, 16);
			}
			{
				jButtonToGoToMainMenu = new JButton();
				getContentPane().add(jButtonToGoToMainMenu);
				jButtonToGoToMainMenu.setText("Go To Main Menu");
				jButtonToGoToMainMenu.setBounds(149, 135, 191, 23);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("LogOut");
				jButtonLogOut.setBounds(149, 176, 187, 23);
			}
			{
				jLabel1ResourceType = new JLabel();
				getContentPane().add(jLabel1ResourceType);
				jLabel1ResourceType.setText("Resource Type");
				jLabel1ResourceType.setBounds(57, 221, 124, 16);
			}
			
			{
				jLabelResourceTitle = new JLabel();
				getContentPane().add(jLabelResourceTitle);
				jLabelResourceTitle.setText("Resource Title");
				jLabelResourceTitle.setBounds(57, 261, 100, 16);
			}
			
			{
				jLabelResourceAuthor = new JLabel();
				getContentPane().add(jLabelResourceAuthor);
				jLabelResourceAuthor.setText("Resource Author");
				jLabelResourceAuthor.setBounds(57, 304, 102, 16);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Logged In as ");
				jLabelUserLogedIn.setBounds(39, 361, 120, 16);
			}
			{
				Img = new JLabel();
				getContentPane().add(Img);
				Img.setText("");
				Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
				Img.setIcon(new ImageIcon(img));
				Img.setBounds(149, 12, 187, 53);
			}
			
			pack();
			setSize(500, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void actionGoToMainMenu() 
	{
		
		
		jButtonToGoToMainMenu.addActionListener(new ActionListener() 
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
