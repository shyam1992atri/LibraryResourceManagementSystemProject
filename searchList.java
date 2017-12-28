package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Random;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

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
public class searchList extends javax.swing.JFrame {
	private JLabel lblSearchList;
	private JButton cmdCancel;
	private JButton cmdLogout;
	private JLabel jTextFieldULI;
	private JButton jButtonSearch;
	private JLabel jLabelUserLogedIn;
	private String userN="";
	private JTextField jLabelRTFromExcel;
	private JTextField jLabelAuthor;
	private JLabel jLabelResourceAuthor;
	private JTextField jLabelTitle;
	private JLabel jLabelResourceTitle;
	private JLabel jLabel1ResourceType;

	private JLabel Img;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default search page";
				searchList inst = new searchList(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public searchList(String p) {
		super();
		this.userN=p;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(266, 390, 217, 23);
		jTextFieldULI.setText(p);
		initGUI();
		actionLogOut();
		actionCancel();
		actionSearch();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				lblSearchList = new JLabel();
				getContentPane().add(lblSearchList);
				lblSearchList.setText("SEARCH LIST");
				lblSearchList.setBounds(211, 126, 188, 40);
				lblSearchList.setFont(new java.awt.Font("Segoe UI",1,24));
			}
			{
				cmdLogout = new JButton();
				getContentPane().add(cmdLogout);
				cmdLogout.setText("Logout");
				cmdLogout.setBounds(62, 453, 120, 36);
			}
			{
				cmdCancel = new JButton();
				getContentPane().add(cmdCancel);
				cmdCancel.setText("Cancel");
				cmdCancel.setBounds(315, 453, 130, 40);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Loged In as ");
				jLabelUserLogedIn.setBounds(80, 393, 102, 16);
			}
			{
				jButtonSearch = new JButton();
				getContentPane().add(jButtonSearch);
				jButtonSearch.setText("Search");
				jButtonSearch.setBounds(57, 348, 174, 23);
			}
			{
				jLabel1ResourceType = new JLabel();
				getContentPane().add(jLabel1ResourceType);
				jLabel1ResourceType.setText("Resource Type");
				jLabel1ResourceType.setBounds(57, 216, 124, 16);
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
				jLabelTitle = new JTextField();
				getContentPane().add(jLabelTitle);
				jLabelTitle.setBounds(187, 258, 337, 19);
			}
	 		{
				jLabelAuthor = new JTextField();
				getContentPane().add(jLabelAuthor);
				jLabelAuthor.setBounds(187, 301, 337, 23);
			}
	 		{
				jLabelRTFromExcel = new JTextField();
				getContentPane().add(jLabelRTFromExcel);
				jLabelRTFromExcel.setBounds(187, 213, 337, 19);
			}

	 		{
	 						Img = new JLabel();
	 						getContentPane().add(Img);
	 						Img.setText("");
	 						Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
	 						Img.setIcon(new ImageIcon(img));
	 						Img.setBounds(199, 12, 185, 57);
	 		}
			pack();
			setSize(600, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionLogOut() 
	{
		
		
		cmdLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				LogInPage regFace =new LogInPage();
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action log out
	
	public void actionCancel() 
	{
		
		
		cmdCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ServicesList regFace =new ServicesList(userN);
 				
 				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action cancel
	public void actionSearch() 
	{
		
		
		jButtonSearch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				String type = jLabelRTFromExcel.getText();
				String Author = jLabelAuthor.getText();
				String Title = jLabelTitle.getText();
				
				InputStream MakeRequestExcelSheet = null;
				try {
					MakeRequestExcelSheet = new FileInputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\ResourcesDataBase.xls");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				HSSFWorkbook wbrdb = null;
				try {
					wbrdb = new HSSFWorkbook(MakeRequestExcelSheet);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				// Here write the functionality
				HSSFSheet sheet = wbrdb.getSheetAt(0);
				int lr = sheet.getLastRowNum();
				System.out.println("last row num "+lr);
				HSSFRow row = null;
				HSSFCell col=null;// to get column number
				
				
		 		int flag =1;
		 		
				for(int j=8;j<lr+1;j++)
				{
					String resourceType = sheet.getRow(j).getCell((short) 6).getStringCellValue();
			 		String resourceTitle = sheet.getRow(j).getCell((short) 8).getStringCellValue();
			 		String author = sheet.getRow(j).getCell((short) 9).getStringCellValue();
			 		String availablity = sheet.getRow(j).getCell((short) 10).getStringCellValue();
			 		String location = sheet.getRow(j).getCell((short) 11).getStringCellValue();
			 		double searchFlag = sheet.getRow(j).getCell((short) 13).getNumericCellValue();
			 		
					if(resourceType.equals(type) && resourceTitle.equals(Title) && author.equals(Author) && availablity.equals("AV"))
					{
						SearchResults regFace =new SearchResults(userN,resourceType,resourceTitle,author,location);
		 				
		 				regFace.setVisible(true);
						dispose();
						flag--;
						break;
					}
					if(resourceType.equals(type) && resourceTitle.equals(Title) && author.equals(Author) && availablity.equals("NA") && searchFlag>5.0)
					{	flag=2;
						//double searchFlag = sheet.getRow(j).getCell((short) 13).getNumericCellValue();
						double newFlag= searchFlag+1;
						sheet.createRow(j).createCell((short) 13).setCellValue(searchFlag+1);
						if(newFlag>5)
						{
							String requestText = resourceTitle;
							String userWhoMadeRequest = userN;
							
							makeARequest regFace =new makeARequest(userWhoMadeRequest,requestText);
			 				
			 				regFace.setVisible(true);
							dispose();
							flag = 3;
							break;
						
						}
						
						
						
					}
				}
				if(flag==1)
		 		{
		 			JOptionPane.showMessageDialog(null,"Wrong key words Search Again");
		 			jLabelRTFromExcel.setText("");
		 			jLabelAuthor.setText("");
		 			jLabelTitle.setText("");
		 			jLabelTitle.requestFocus();
		 		}
				if(flag==2)
		 		{
		 			JOptionPane.showMessageDialog(null,"Resource Not Available search for a different resource");
		 			jLabelRTFromExcel.setText("");
		 			jLabelAuthor.setText("");
		 			jLabelTitle.setText("");
		 			jLabelTitle.requestFocus();
		 		}
				if(flag==3)
		 		{
		 			JOptionPane.showMessageDialog(null,"Resource Not Available in search you can request for new resource");
		 			jLabelRTFromExcel.setText("");
		 			jLabelAuthor.setText("");
		 			jLabelTitle.setText("");
		 			jLabelTitle.requestFocus();
		 		}
		 		
		 		
		 		//String availablity = sheet.getRow(Result).getCell((short) 10).getStringCellValue();
		 		//System.out.println(availablity);
		 		
		 		
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream("C:\\Users\\SHYAM PRASAD V ATRI\\workspace2\\testWorking\\src\\testing\\ResourcesDataBase.xls");
					wbrdb.write(fos);
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
		
	}// end of action search

}
