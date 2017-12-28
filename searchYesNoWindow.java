package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;

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
public class searchYesNoWindow extends javax.swing.JFrame {
	private JLabel lblSearchYesNoWindow;
	private JButton cmdLogout;
	private JButton cmdCancel;
	private JButton cmdCheckOut;
	private JButton cmdSearch;
	private JLabel jTextFieldULI;
	private JLabel jLabelUserLogedIn;
	private String userN="";
	private JLabel Img;


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default services check out or search page";
				searchYesNoWindow inst = new searchYesNoWindow(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public searchYesNoWindow(String p) {
		super();
		this.userN=p;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(272, 308, 217, 23);
		jTextFieldULI.setText(p);
		initGUI();
		actionCancel() ;
		actionLogOut();
		actionSearch();
		actionCheckOut();
		actionLogOut();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				lblSearchYesNoWindow = new JLabel();
				getContentPane().add(lblSearchYesNoWindow);
				lblSearchYesNoWindow.setText("Do you want to search the resource?");
				lblSearchYesNoWindow.setBounds(159, 62, 330, 46);
				lblSearchYesNoWindow.setFont(new java.awt.Font("Segoe UI",1,15));
			}
			{
				cmdSearch = new JButton();
				getContentPane().add(cmdSearch);
				cmdSearch.setText("Search");
				cmdSearch.setBounds(51, 139, 115, 46);
				cmdSearch.setFont(new java.awt.Font("Segoe UI",0,18));
			}
			{
				cmdCheckOut = new JButton();
				getContentPane().add(cmdCheckOut);
				cmdCheckOut.setText("Check Out");
				cmdCheckOut.setBounds(214, 141, 138, 44);
				cmdCheckOut.setFont(new java.awt.Font("Segoe UI",0,18));
			}
			{
				cmdLogout = new JButton();
				getContentPane().add(cmdLogout);
				cmdLogout.setText("Logout");
				cmdLogout.setBounds(214, 228, 128, 36);
			}
			{
				cmdCancel = new JButton();
				getContentPane().add(cmdCancel);
				cmdCancel.setText("Cancel");
				cmdCancel.setBounds(404, 142, 119, 43);
				cmdCancel.setFont(new java.awt.Font("Segoe UI",0,18));
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Loged In as ");
				jLabelUserLogedIn.setBounds(119, 311, 102, 16);
			}


			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(202, 10, 183, 57);
			}
			pack();
			setSize(600, 450);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
	
	public void actionSearch() 
	{
		
		
		cmdSearch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				searchList regFace =new searchList(userN);
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action search
	
	public void actionCheckOut() 
	{
		
		
		cmdCheckOut.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				scannerMessageForCheckOut regFace =new scannerMessageForCheckOut(userN);
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action check out
	

}
