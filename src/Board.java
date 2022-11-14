import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Board extends JPanel {

    public Board(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Line2D line = new Line2D.Double(0, 0, 100, 100);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(line);
        Ellipse2D ellipse = new Ellipse2D.Double(0,0,100,100);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(ellipse);
        Rectangle2D rect = new Rectangle2D.Double(0,0,100,100);
        g2d.draw(rect);
    }
}
