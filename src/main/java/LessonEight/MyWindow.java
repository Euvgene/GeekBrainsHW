package LessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class MyWindow extends JFrame {
    public MyWindow() {

        Drawing drawing = new Drawing();
        setTitle("Урок восьмой");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 200, 800, 800);
        JButton button = new JButton("EXIT");
        JButton button1 = new JButton("DRAWING");
        setLayout(new BorderLayout());
        add(button, BorderLayout.SOUTH);
        add(button1, BorderLayout.NORTH);
        add(drawing);
        button.setForeground(new Color(4, 4, 19));
        button1.setForeground(new Color(236, 11, 45));
        button.setBackground(new Color(224, 211, 211));
        button1.setBackground(new Color(71, 215, 215));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                drawing.setLine(new Line2D.Double(100, 100, 400, 100));
                drawing.setRectangle(new Rectangle(200, 200, 100, 150));
                drawing.repaint();
            }
        });
        setVisible(true);
    }
}