import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

//  This class describes an ArtCanvas, an area in which you can draw.
//  Make your changes in the method paintComponent().
//
//                                          J Brown 2016

class ArtCanvas extends JPanel {
  
  private Color color;
  private final int SIZE = 400;
  
  public ArtCanvas() {
    color = randomColor();
    setBackground(Color.white);
    setPreferredSize (new Dimension(SIZE,SIZE));
    setMinimumSize (new Dimension(SIZE,SIZE));
    setMaximumSize (new Dimension(SIZE,SIZE));
    setBorder(new LineBorder(Color.black,1));
  }
	
	
  public void changeColor() {
    color = randomColor();
  }
  
  private Color randomColor() {
    
    int red   = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue  = (int) (Math.random() * 256);
    
    return new Color (red, green, blue);
  }
  
  // paintComponent() is the method where drawing actually occurs
  // Make your changes here...
  
  public void paintComponent (Graphics g) {
    
    super.paintComponent(g);	// keep this line
    
    // draw a rectangle in a random color that changes
    // when the button is pressed
    
    g.setColor(color);
    g.fillRect(0,0,50,50);
    
    // draw a green one
    
    g.setColor(Color.green);
    g.fillRect(50,50,50,50);
    
    // draw some other stuff
    
    g.drawLine(200,0,0,200);
    g.drawOval(150,25,5,20);
    g.setColor(Color.blue);
    g.drawRect(50,50,60,60);
    g.drawString("Isn't this artsy and craaaazy?",100,150);
    
    // draw a funnel-like object
    
    g.setColor(Color.black);
    
    int x = 200;
    int h = 200;
    
    
    while (x <=400 && h <= 200 )
    {    
      g.drawOval(x,x,h,h);
      x = x+5;
      h = h-10; //draw a series of concentric circles
      
    }
    g.drawString ("THIS WAS NOT the Most fun I ever had", 150, 150);
    g.drawRoundRect (20, 11, 33, 14, 50, 50);
    
    Color azure = new Color (22, 100, 222); 
    g.drawOval (10,10, 100, 100);
    g.drawRoundRect (100, 100, 200, 200, 45, 20);
    
  }
}



