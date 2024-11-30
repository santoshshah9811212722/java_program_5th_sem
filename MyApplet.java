import java.applet.Applet;
// import java.awt.Graphics;
import java.awt.*;

public class MyApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        // Draw a rectangle
        g.drawRect(50, 50, 200, 100);
       g.setColor(Color.BLUE);
       g.fillRect(50, 50, 200, 100);
        // Display a string on the applet
        g.drawString("Welcome to Java Applet", 450, 200);
    }
}
