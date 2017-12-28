package lrmsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
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
public class ServicesList extends javax.swing.JFrame 
{
	private JButton jButtonRenewal;
	private JLabel jLabelTitleForThisWindow;
	private JLabel jTextFieldULI;
	private JLabel jLabelUserLogedIn;
	private JButton jButtonLogOut;
	private JButton jButtonRequestNewBook;
	private JButton jButtonCheckOut;
	private JButton jButtonCheckIN;
	private JLabel Img;

	private String userN="";
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				String S1 = "default services page";
				ServicesList inst = new ServicesList(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	
	
	public ServicesList(String p) 
	{
		super();
		
		this.userN=p;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(142, 297, 217, 23);
		jTextFieldULI.setText(p);
		initGUI();
		actionCheckIN();
		actionLogOut();
		actionRequestNewBook();
		actionRenewal();
		actionCheckOut();
	}
	
	private void initGUI() 
	{
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jButtonCheckIN = new JButton();
				getContentPane().add(jButtonCheckIN);
				jButtonCheckIN.setText("1. Check In");
				jButtonCheckIN.setBounds(70, 119, 187, 23);
			}
			{
				jButtonCheckOut = new JButton();
				getContentPane().add(jButtonCheckOut);
				jButtonCheckOut.setText("2. CheckOut");
				jButtonCheckOut.setBounds(70, 163, 187, 23);
			}
			{
				jButtonRenewal = new JButton();
				getContentPane().add(jButtonRenewal);
				jButtonRenewal.setText("3. Renewal");
				jButtonRenewal.setBounds(70, 209, 187, 23);
			}
			{
				jButtonRequestNewBook = new JButton();
				getContentPane().add(jButtonRequestNewBook);
				jButtonRequestNewBook.setText("4. Request New Resource");
				jButtonRequestNewBook.setBounds(70, 252, 187, 23);
			}
			{
				jLabelTitleForThisWindow = new JLabel();
				getContentPane().add(jLabelTitleForThisWindow);
				jLabelTitleForThisWindow.setText("Select the service type");
				jLabelTitleForThisWindow.setBounds(88, 75, 253, 16);
			}
			{
				jButtonLogOut = new JButton();
				getContentPane().add(jButtonLogOut);
				jButtonLogOut.setText("LogOut");
				jButtonLogOut.setBounds(99, 328, 79, 23);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Loged In as ");
				jLabelUserLogedIn.setBounds(34, 300, 102, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(63, 5, 185, 58);
			}
			

			pack();
			setSize(330, 400);
		}// end of try 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void actionCheckIN() 
	{
		
		
		jButtonCheckIN.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ScanWindowCheckIN regFace =new ScanWindowCheckIN(userN);
				regFace.setVisible(true);
				dispose();
			}
		});
		
	}// end of action Check IN
	
	public void actionCheckOut()
	{
		jButtonCheckOut.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				searchYesNoWindow regFace =new searchYesNoWindow(userN);
				regFace.setVisible(true);
				dispose();
			}
		});
	}
	
	public void actionRenewal()
	{

		
		
		jButtonRenewal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				ScanWindowForRenewal regFace =new ScanWindowForRenewal(userN);
				regFace.setVisible(true);
				dispose();
			}
		});
		
	}
	
	public void actionRequestNewBook()
	{
		jButtonRequestNewBook.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				makeARequest regFace =new makeARequest(userN);
				regFace.setVisible(true);
				dispose();
		 	
			}
		});
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


}
