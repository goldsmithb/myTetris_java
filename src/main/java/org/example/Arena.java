package org.example;

import javax.swing.*;
import java.awt.*;

public class Arena extends JPanel {
    final protected Dimension SIZE = new Dimension(200,400);
    public void paintComponent(Graphics g) {
        // this method is called by the system when a change in the window is detected
        // or when a component invokes repaint()
        // we need to make sure we run the inherited method first
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.drawRect(0,0,SIZE.width,SIZE.height);
        g.fillRect(100, 100, 30, 30);
    }
}
