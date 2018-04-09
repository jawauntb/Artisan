import javax.swing.*;

//  This file describes the construction and behavior of a 
//  graphics JFrame.
//  J Brown 2016

public class Artisan extends JFrame {

    Artisan() {
	super ("Artisan");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setContentPane(new ArtPanel());
	pack();
	setVisible(true);
    }

    public static void main (String[] args) {

	new Artisan();   // create a new Lab3 frame

    }
}

