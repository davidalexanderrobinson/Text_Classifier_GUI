

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TooltipExample extends javax.swing.JFrame {

	public TooltipExample() {
		initUI();
	}

	private void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

 		panel.setLayout(null);
		panel.setToolTipText("This is a Panel container.");
		JButton button = new JButton("Button");
		button.setBounds(100, 60, 100, 30);
		button.setToolTipText("This is a button component.");
		panel.add(button);
		setTitle("Tooltip");
		setSize(320, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

  	public static void main(String[] args)  {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				TooltipExample ex = new TooltipExample();
				ex.setVisible(true);
			}
		});
	}
}
