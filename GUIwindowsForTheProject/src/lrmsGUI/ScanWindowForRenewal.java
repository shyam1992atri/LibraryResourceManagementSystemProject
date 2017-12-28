package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;


import javax.swing.JButton;
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
public class ScanWindowForRenewal extends javax.swing.JFrame {
	
	private JLabel jLabelTitleForThisWindow;
	private JButton jButtonLogOut;
	private JButton jButtonCancel;
	private JButton jButtonScan;
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
				String S1 = "default renewal Scan Window page";
				ScanWindowForRenewal inst = new ScanWindowForRenewal(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ScanWindowForRenewal(String p) {
		super();
		this.userN=p;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(142, 286, 217, 23);
		jTextFieldULI.setText(p);
		initGUI();
		actionRenewal();
		actionCancel();
		actionLogOut();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			{
				jLabelTitleForThisWindow = new JLabel();
				getContentPane().add(jLabelTitleForThisWindow);
				jLabelTitleForThisWindow.setText("Place the resource under Scanner");
				jLabelTitleForThisWindow.setBounds(94, 88, 253, 16);
			}
			{
				jButtonScan = new JButton();
				getContentPane().add(jButtonScan);
				jButtonScan.setText("Scan");
				jButtonScan.setBounds(52, 127, 245, 23);
			}
			{
				jButtonCancel = new JButton();
				getContentPane().add(jButtonCancel);
				jButtonCancel.setText("Cancel");
				jButtonCancel.setBounds(52, 182, 245, 23);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("Log Out");
				jButtonLogOut.setBounds(52, 237, 245, 23);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User logged in as ");
				jLabelUserLogedIn.setBounds(18, 289, 124, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(94, 12, 181, 53);
			}
			pack();
			setSize(380, 380);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
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
	public void actionRenewal()
	{

		
		
		jButtonScan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				requestProcessed regFace =new requestProcessed(userN);
				regFace.setVisible(true);
				dispose();
			}
		});
		
	}

}
