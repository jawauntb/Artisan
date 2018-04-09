Three .java files work together to form a single program. Run the program
by typing " <java Artisan> "

How does it function?
The main method, in class Artisan, creates a graphics frame. The frame creates a
panel, described in class ArtPanel. The code in ArtCanvas.java and ArtPanel.java
pulls from the ArtCanvas.java. The methods that actually draw the picture are contained in the paintComponent() method in ArtCanvas.java. Locations in the painted window are set using x and y coordinates. The origin (0,0) is in the upper left corner. The x is across/y is down.
