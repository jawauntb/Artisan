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

