package LessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Drawing extends JPanel {
    private Line2D line;
    private Rectangle rectangle;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (line != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.GREEN);
            g2.setStroke(new BasicStroke(8));
            g2.draw(line);
        }
        if (rectangle != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(25));
            g2.draw(rectangle);
        }
    }

    public void setLine(Line2D line) {
        this.line = line;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}