package lrmsGUI;
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
public class scanErrorMessage extends javax.swing.JFrame {
	private JLabel lblError;
	private JLabel lblScanErrorMessage1;
	private JButton cmdLogout;
	private JButton cmdCancel;
	private JButton cmdReScan;
	private JLabel lblScanErrorMessage;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				scanErrorMessage inst = new scanErrorMessage();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public scanErrorMessage() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				lblError = new JLabel();
				getContentPane().add(lblError);
				lblError.setText("Error!");
				lblError.setBounds(273, 23, 118, 46);
				lblError.setFont(new java.awt.Font("Segoe UI",1,26));
			}
			{
				lblScanErrorMessage = new JLabel();
				getContentPane().add(lblScanErrorMessage);
				lblScanErrorMessage.setText("Oops! There was some problem in scanning the resource.");
				lblScanErrorMessage.setBounds(104, 110, 482, 21);
				lblScanErrorMessage.setFont(new java.awt.Font("Segoe UI",0,18));
			}
			{
				lblScanErrorMessage1 = new JLabel();
				getContentPane().add(lblScanErrorMessage1);
				lblScanErrorMessage1.setText("Please place the resource under the barcode reader and re-scan.");
				lblScanErrorMessage1.setBounds(78, 143, 594, 21);
				lblScanErrorMessage1.setFont(new java.awt.Font("Segoe UI",0,18));
			}
			{
				cmdReScan = new JButton();
				getContentPane().add(cmdReScan);
				cmdReScan.setText("Rescan");
				cmdReScan.setBounds(150, 210, 123, 47);
			}
			{
				cmdCancel = new JButton();
				getContentPane().add(cmdCancel);
				cmdCancel.setText("Cancel");
				cmdCancel.setBounds(345, 210, 109, 47);
			}
			{
				cmdLogout = new JButton();
				getContentPane().add(cmdLogout);
				cmdLogout.setText("Logout");
				cmdLogout.setBounds(511, 30, 61, 28);
			}
			pack();
			setSize(700, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
