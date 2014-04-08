package org.davidalexanderrobinson.gui.sample;
//
// Author: David A. Robinson
// Date: 12/25/2013
// FileName: Example.java
//
//
// Description: A menubar and menu example.  The imageicon needs a different filename, a URL perhaps.
//              I also need to rename images.jpeg, and check it into the repository.
//   		The JMenuItem also has a Mnemonic.  There is also tooltiptext being used in this application.
//		If you can't tell already, I'm just beginning to learn Java Swing.
//
//
//
//
//
// 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Example extends javax.swing.JFrame {

	// Initialize the GUI in a separate function.  Such is good practice.

	public Example() {
		initUI();
	}

	// The function that initializes the User Interface.

	public final void initUI() {

		// Create a new menubar.
		JMenuBar menubar = new JMenuBar();

		// The below line needs to be changed.
		ImageIcon icon = new ImageIcon("/Users/daverob/Desktop/images.jpeg");

		// Create a menu. 
		JMenu file = new JMenu("File");
		
		// Alternate-F goes for the file menu.
		file.setMnemonic(KeyEvent.VK_F);

		// A Menu Item with an "Exit" icon.
		JMenuItem eMenuItem = new JMenuItem("Exit", icon);

		// Alt-F Alt-E exits the application.
		eMenuItem.setMnemonic(KeyEvent.VK_E);

		// Set Tool Tip Text for the exiting of the application.
		eMenuItem.setToolTipText("Exit Application.");


		// Look at this code closely.  We create an anonymous class.
		eMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		// Add the menu item to the menu.
		file.add(eMenuItem);

		// Add the menu to the menu bar.
		menubar.add(file);
		
		// Set the menu bar and attach it to the JFrame.
		setJMenuBar(menubar);

		// Set the title of this upper level frame.
		setTitle("Simple Menu");

 		// Set the size of this JFrame.
		setSize(300, 200);

		// Set the location relative to null to place in the center of the screen.
		setLocationRelativeTo(null);

		// Remember to allow the exit button in the corner of the frame.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// The trusty main method.
	// 
	public static void main(String[] args) {
		// Remember to run the Swing GUI in a different thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Example ex = new Example();
				// Make the main JFrame visible.
				ex.setVisible(true);
			}
		});
	}
}
