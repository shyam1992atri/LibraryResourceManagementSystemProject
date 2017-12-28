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
public class scannerMessageForCheckOut extends javax.swing.JFrame {
	private JLabel lblScannerMessage;
	private JButton cmdLogout;
	private JButton cmdScan;
	private JButton cmdCancel;
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
				String S1 = "default check out scan window page";
				scannerMessageForCheckOut inst = new scannerMessageForCheckOut(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public scannerMessageForCheckOut(String UN) {
		super();
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(192, 208, 217, 23);
		jTextFieldULI.setText(UN);
		initGUI();
		actionCancel();
		actionLogOut();
		actionScan();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				lblScannerMessage = new JLabel();
				getContentPane().add(lblScannerMessage);
				lblScannerMessage.setText("Place the resource under the barcode scanner");
				lblScannerMessage.setBounds(8, 55, 525, 53);
				lblScannerMessage.setFont(new java.awt.Font("Segoe UI",1,24));
			}
			{
				cmdLogout = new JButton();
				getContentPane().add(cmdLogout);
				cmdLogout.setText("Logout");
				cmdLogout.setBounds(389, 15, 129, 28);
			}
			{
				cmdScan = new JButton();
				getContentPane().add(cmdScan);
				cmdScan.setText("Scan");
				cmdScan.setBounds(148, 125, 115, 36);
			}
			{
				cmdCancel = new JButton();
				getContentPane().add(cmdCancel);
				cmdCancel.setText("Cancel");
				cmdCancel.setBounds(314, 125, 116, 36);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User logged in as ");
				jLabelUserLogedIn.setBounds(51, 211, 112, 16);
			}


			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(23, 5, 185, 57);
			}
			pack();
			setSize(560, 350);
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
	
	public void actionScan() 
	{
		
		
		cmdScan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				
				
				ReceptSentAuthentication regFace =new ReceptSentAuthentication(userN);
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
		
	}// end of action scan
	

}
