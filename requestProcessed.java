package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;
import javax.swing.ImageIcon;

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
public class requestProcessed extends javax.swing.JFrame {
	private JButton mainMenu;
	private JButton jButton1;
	private String userN="";
	private JLabel jLabelUserLogedIn;
	private JLabel jTextFieldULI;
	private JLabel jLabel1;

	private JLabel Img;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default req processed page";
				requestProcessed inst = new requestProcessed(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public requestProcessed(String UN) {
		
		super();
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(162, 271, 217, 23);
		jTextFieldULI.setText(UN);
		initGUI();
		actionLogOut();
		actionGoToMainMenu();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				mainMenu = new JButton();
				getContentPane().add(mainMenu);
				mainMenu.setText("Main Menu");
				mainMenu.setBounds(48, 183, 102, 41);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Log Out");
				jButton1.setBounds(213, 183, 98, 41);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User logged in as ");
				jLabelUserLogedIn.setBounds(22, 274, 123, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(96, 12, 185, 57);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Your request has been processed");
				jLabel1.setBounds(85, 96, 217, 25);
				jLabel1.setFont(new java.awt.Font("Segoe UI",0,14));
			}
			pack();
			setSize(400, 400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void actionLogOut() 
	{
		
		
		jButton1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				LogInPage regFace =new LogInPage();
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action log out
	
	public void actionGoToMainMenu() 
	{
		
		
		mainMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ServicesList regFace =new ServicesList(userN);
 				
 				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action go to main menu
	

	
}
