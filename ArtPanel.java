import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

//  This file describes the construction and behavior of the main
//  panel
//                   J Brown 2016 for Aarathi Prasad-Amherst College


public class ArtPanel extends JPanel implements ActionListener {

    private ArtCanvas myCanvas;
    private JButton colorButton;

    ArtPanel() {

	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

	// We create various graphical objects and add them
	// to the frame

	JLabel msg1 = new JLabel ("Clicking on the button " +
				"changes the color of the object");
	add(msg1);
	msg1.setAlignmentX(0.5f);

	add(Box.createVerticalStrut(20));

	colorButton = new JButton("Change color");
	colorButton.addActionListener(this);
	add(colorButton);
	colorButton.setAlignmentX(0.5f);
	
	add(Box.createVerticalStrut(20));

	myCanvas = new ArtCanvas();
	add(myCanvas);
	myCanvas.setAlignmentX(0.5f);

	setBorder (new EmptyBorder(50, 50, 50, 50));
    }

    public void actionPerformed (ActionEvent e) {

	// Here we handle button clicks, by invoking methods for our object

	myCanvas.changeColor();
	myCanvas.repaint();
    }
}
