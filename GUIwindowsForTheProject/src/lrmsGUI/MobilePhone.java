package lrmsGUI;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Color;




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
public class MobilePhone extends javax.swing.JFrame {
	private JLabel jLabelLocation;
	
	private String location = "";
	
	private String userN="";
	private JLabel Img;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				String S0 = "this is user";
				String S1 = "This is default location string";
				MobilePhone inst = new MobilePhone(S0, S1);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MobilePhone(String UN , String locat) {
		super();
		this.userN=UN;
		this.location=locat;
		JLabel title = new JLabel(locat, JLabel.CENTER);
		title.setForeground(Color.white);
		jLabelLocation = new JLabel();
		getContentPane().add(jLabelLocation);
		jLabelLocation.setBounds(111, 496, 217, 21);
		jLabelLocation.setText(locat);
		jLabelLocation.setFont(new java.awt.Font("Arial",0,16));
		initGUI();
		ServicesList regFace =new ServicesList(userN);
			
		regFace.setVisible(true);
		dispose();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			
			{
				Img = new JLabel();
				getContentPane().add(Img);
				Img.setText("");
				Image img = new ImageIcon(this.getClass().getResource("/MobileImage.jpg")).getImage();
				Img.setIcon(new ImageIcon(img));
				Img.setBounds(7, 5, 321, 549);
			}
			
			pack();
			setSize(390, 600);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
