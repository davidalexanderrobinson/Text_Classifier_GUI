
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class SubmenuExample extends JFrame {

	public SubmenuExample() {
		initUI();
	}

	public final void initUI() {

		JMenuBar menubar = new JMenuBar();
		ImageIcon iconNew = new ImageIcon("new.jpg");
		ImageIcon iconOpen = new ImageIcon("open.jpg");
		ImageIcon iconSave = new ImageIcon("save.jpg");
		ImageIcon iconExit = new ImageIcon("exit.jpg");
		
		JMenu jmenuFile = new JMenu("File");
		jmenuFile.setMnemonic(KeyEvent.VK_F);
		
	        JMenu jmenuImport = new JMenu("Import");
		jmenuImport.setMnemonic(KeyEvent.VK_M);

		JMenuItem newsf = new JMenuItem("Import newsfeed list...");
		JMenuItem bookm = new JMenuItem("Import bookmarks...");
		JMenuItem mail  = new JMenuItem("Import mail...");

      		jmenuImport.add(newsf);
		jmenuImport.add(bookm);
		jmenuImport.add(mail);

		JMenuItem fileNew = new JMenuItem("New", iconNew);
		fileNew.setMnemonic(KeyEvent.VK_N);
		fileNew.setToolTipText("Create a new file for this application...");

		JMenuItem fileOpen = new JMenuItem("Open", iconOpen);
		fileOpen.setMnemonic(KeyEvent.VK_O);
	  	fileOpen.setToolTipText("Open a file in this application...");	

		JMenuItem fileSave = new JMenuItem("Save", iconSave);
		fileSave.setMnemonic(KeyEvent.VK_S);
		fileSave.setToolTipText("Save a file...");

		JMenuItem fileExit = new JMenuItem("Exit", iconExit);
		fileExit.setMnemonic(KeyEvent.VK_C);
		fileExit.setToolTipText("Exit Application!");
		fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
			ActionEvent.CTRL_MASK));
		
		fileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) { 
				System.exit(0);
			}
		});

		jmenuFile.add(fileNew);
		jmenuFile.add(fileOpen);
		jmenuFile.add(fileSave);
		jmenuFile.addSeparator();
		jmenuFile.add(jmenuImport);
		jmenuFile.addSeparator();
		jmenuFile.add(fileExit);

		menubar.add(jmenuFile);
		setJMenuBar(menubar);

		setTitle("Submenu Testing!");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) { 
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SubmenuExample tip = new SubmenuExample();
				tip.setVisible(true);
			}
		});
	}
}	
