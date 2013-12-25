
package org.davidalexanderrobinson.gui.sample;

// Author:  David A. Robinson 
// Date:    12/25/2013
// Filename: AbsolutePositioningExample.java
// 
//
// This code originally comes from zetacode.org.  It is sample GUI code showing how
// to create buttons in Java Swing with a JFrame and position them with absolute components on the
// screen.  The key to the absolute positioning is the set bounds function.  I have changed the names
// of some variables.  This code is primarily for my own learning.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AbsolutePositioningExample extends JFrame {

	// It is good practice to initialize the GUI somewhere other than in the constructor.
	public AbsolutePositioningExample() {
		initUI();
	}

	// This function initializes the graphical user interface.
	public final void initUI() {

		// If we don't set a layout, the layout is flow layout by default.
		// We want an absolute positioning layout instead.
		setLayout(null);

		// Create a button.
		JButton okbutton = new JButton("OK");

		// X=50, Y=50, WIDTH=80, HEIGHT=25
		okbutton.setBounds(50, 50, 80, 25);

		// Create another button.
		JButton closebutton = new JButton("Close");
		
		// X=150, Y=50, WIDTH=80, HEIGHT=25
		closebutton.setBounds(150, 50, 80, 25);

		// Add these buttons to the JFrame.
  		add(okbutton);
		add(closebutton);


		// Set the title of the top-level frame.  One should usually include this step.
		setTitle("Absolute Positioning Example.");

		// Set the size of the JFrame.
		setSize(350, 300);

		// We need to be able to close the JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Put the JFrame in the center of the screen.
		setLocationRelativeTo(null);
	}

	// Main function.  We need another thread for this, hence the new Runnable.
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				AbsolutePositioningExample example = new AbsolutePositioningExample();
				example.setVisible(true);
			}
		});
	}

}
