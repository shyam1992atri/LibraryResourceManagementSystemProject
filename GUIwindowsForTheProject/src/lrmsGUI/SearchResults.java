package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class SearchResults extends javax.swing.JFrame {
	private JLabel jLabelTitleForTheWindow;
	private JButton jButtonSendLocationToMobile;
	private JButton jButtonLogOut;
	private JLabel jTextFieldULI;
	private JLabel jLabelUserLogedIn;
	private JLabel jLabelRTFromExcel;
	private JLabel jLabelAuthor;
	private JLabel jLabelResourceAuthor;
	private JLabel jLabelTitle;
	private JLabel jLabelResourceTitle;
	private JLabel jLabel1ResourceType;
	private String userN="";
	private String resTyp="";
	private String resTitl="";
	private String resAuth="";
	private String loc123 = "";
	private JLabel Img;


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default search results page";
				String typ = "Default resource type";
				String titl = "Default resource title";
				String auth = "Default resource author";
				String loc = "default location";
				
				SearchResults inst = new SearchResults(S1,typ,titl,auth,loc);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public SearchResults(String un, String RType, String RTitle, String RAuthor, String locat) {
		super();
		this.userN=un;
		this.resTyp=RType;
		this.resTitl=RTitle;
		this.resAuth=RAuthor;
		this.loc123=locat;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(159, 388, 209, 23);
		jTextFieldULI.setText(un);
		{
			jLabelRTFromExcel = new JLabel();
			getContentPane().add(jLabelRTFromExcel);
			jLabelRTFromExcel.setText(RType);
			jLabelRTFromExcel.setBounds(187, 108, 337, 19);
		}
		{
			jLabelTitle = new JLabel();
			getContentPane().add(jLabelTitle);
			jLabelTitle.setText(RTitle);
			jLabelTitle.setBounds(187, 166, 337, 19);
		}
		{
			jLabelAuthor = new JLabel();
			getContentPane().add(jLabelAuthor);
			jLabelAuthor.setText(RAuthor);
			jLabelAuthor.setBounds(187, 213, 337, 23);
		}
		{
			jLabelUserLogedIn = new JLabel();
			getContentPane().add(jLabelUserLogedIn);
			jLabelUserLogedIn.setText("User Logged In as ");
			jLabelUserLogedIn.setBounds(39, 391, 114, 16);
		}
		
		initGUI();
		actionLogOut();
		actionSendLocation();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelTitleForTheWindow = new JLabel();
				getContentPane().add(jLabelTitleForTheWindow);
				jLabelTitleForTheWindow.setText("Search Result");
				jLabelTitleForTheWindow.setBounds(135, 83, 116, 14);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("LogOut");
				jButtonLogOut.setBounds(114, 310, 94, 23);
			}
			{
				jButtonSendLocationToMobile = new JButton();
				getContentPane().add(jButtonSendLocationToMobile);
				jButtonSendLocationToMobile.setText("Send Location Details to Cell Phone");
				jButtonSendLocationToMobile.setBounds(41, 257, 269, 23);
			}
			{
				jLabelResourceAuthor = new JLabel();
				getContentPane().add(jLabelResourceAuthor);
				jLabelResourceAuthor.setText("Resource Author");
				jLabelResourceAuthor.setBounds(48, 216, 102, 16);
			}
			{
				jLabelResourceTitle = new JLabel();
				getContentPane().add(jLabelResourceTitle);
				jLabelResourceTitle.setText("Resource Title");
				jLabelResourceTitle.setBounds(48, 167, 100, 16);
			}
			{
				jLabel1ResourceType = new JLabel();
				getContentPane().add(jLabel1ResourceType);
				jLabel1ResourceType.setText("Resource Type");
				jLabel1ResourceType.setBounds(48, 109, 124, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(88, 13, 185, 59);
			}
			
			pack();
			setSize(400, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
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
	public void actionSendLocation() 
	{
		
		
		jButtonSendLocationToMobile.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				MobilePhone regFace =new MobilePhone(userN,loc123);
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action send location to mobile

}
