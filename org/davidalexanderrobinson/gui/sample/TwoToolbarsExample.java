

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class TwoToolbarsExample extends javax.swing.JFrame {

		public TwoToolbarsExample() {
			initUI();
		}

		public final void initUI() {

			JToolBar uppertoolbar = new JToolBar();
			JToolBar lowertoolbar = new JToolBar();

			JPanel panel = new JPanel();

			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

			ImageIcon newicon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");
			ImageIcon openicon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");
			ImageIcon saveicon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");
			ImageIcon exiticon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");

			JButton newbutton = new JButton(newicon);
			JButton openbutton = new JButton(openicon);
			JButton savebutton = new JButton(saveicon);
			JButton exitbutton = new JButton(exiticon);

			uppertoolbar.add(newbutton);
			uppertoolbar.add(openbutton);
			uppertoolbar.add(savebutton);

			uppertoolbar.setAlignmentX(0);

			lowertoolbar.add(exitbutton);
			lowertoolbar.setAlignmentX(0);

			exitbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			});

			panel.add(uppertoolbar);
			panel.add(lowertoolbar);

			add(panel, BorderLayout.NORTH);

			setTitle("Two Toolbars Example");
			setSize(400, 300);

			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					TwoToolbarsExample example = new TwoToolbarsExample();
					example.setVisible(true);
				}
			});
		}
}
