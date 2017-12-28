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
public class WhenNoFineIsAdded extends javax.swing.JFrame {
	private JLabel jLabelFineAmountText;
	private JButton jButtonMainMenu;
	private JLabel jLabelInstructionToDropBookInBox;
	private String userN="";
	private JLabel jLabelUserLogedIn;
	private JLabel jTextFieldULI;
	private JLabel Img;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S1 = "default no fine added page";
				WhenNoFineIsAdded inst = new WhenNoFineIsAdded(S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public WhenNoFineIsAdded(String UN) {
		super();
		this.userN=UN;
		jTextFieldULI = new JLabel();
		getContentPane().add(jTextFieldULI);
		jTextFieldULI.setBounds(158, 235, 217, 23);
		jTextFieldULI.setText(UN);
		initGUI();
		actionGoToMainMenu();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelFineAmountText = new JLabel();
				getContentPane().add(jLabelFineAmountText);
				jLabelFineAmountText.setText("Fine Amount = 0 $");
				jLabelFineAmountText.setBounds(111, 80, 142, 16);
			}
			{
				jLabelInstructionToDropBookInBox = new JLabel();
				getContentPane().add(jLabelInstructionToDropBookInBox);
				jLabelInstructionToDropBookInBox.setText("Kindly drop the resource in drop box");
				jLabelInstructionToDropBookInBox.setBounds(68, 119, 226, 16);
			}
			{
				jButtonMainMenu = new JButton();
				getContentPane().add(jButtonMainMenu);
				jButtonMainMenu.setText("Main Menu");
				jButtonMainMenu.setBounds(68, 169, 192, 23);
			}
			{
				jLabelUserLogedIn = new JLabel();
				getContentPane().add(jLabelUserLogedIn);
				jLabelUserLogedIn.setText("User Loged In as ");
				jLabelUserLogedIn.setBounds(56, 238, 102, 16);
			}

			{
							Img = new JLabel();
							getContentPane().add(Img);
							Img.setText("");
							Image img = new ImageIcon(this.getClass().getResource("/Small logo for web.jpg")).getImage();
							Img.setIcon(new ImageIcon(img));
							Img.setBounds(68, 6, 185, 57);
			}
			pack();
			setSize(350, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionGoToMainMenu() 
	{
		
		
		jButtonMainMenu.addActionListener(new ActionListener() 
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
