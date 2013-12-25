
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AbsolutePositioningExample extends JFrame {

	public AbsolutePositioningExample() {
		initUI();
	}

	public final void initUI() {

		setLayout(null);

		JButton okbutton = new JButton("OK");
		okbutton.setBounds(50, 50, 80, 25);

		JButton closebutton = new JButton("Close");
		closebutton.setBounds(150, 50, 80, 25);

  		add(okbutton);
		add(closebutton);


		setTitle("Absolute Positioning Example");
		setSize(350, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				AbsolutePositioningExample example = new AbsolutePositioningExample();
				example.setVisible(true);
			}
		});
	}

}
