
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class JToolbarExample extends JFrame {

	public JToolbarExample() {
		initUI();
	}

	public final void initUI() {

		JMenuBar menubar = new JMenuBar();
		JMenu filemenu = new JMenu("File");
		menubar.add(filemenu);

		setJMenuBar(menubar);

		JToolBar toolbar = new JToolBar();

		ImageIcon icon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");

		JButton exitButton = new JButton(icon);
		toolbar.add(exitButton);

		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});

		add(toolbar, BorderLayout.NORTH);

		setTitle("Title: Simple Toolbar!");
		setSize(300, 300);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JToolbarExample toolbarexample = new JToolbarExample();
				toolbarexample.setVisible(true);
			}
		});
	}

}
