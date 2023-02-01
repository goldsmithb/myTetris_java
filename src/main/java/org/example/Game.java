package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;

public class Game extends JFrame {
    public Game() {
        this.setTitle("myTetris");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component emptyLabel = new Label();
        this.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        // size the frame to fit all content
        this.pack();
        // set location of window
        this.setLocationRelativeTo(null);
        // set an icon image for the window
        // N.B. - SWING DOES NOT SUPPORT ICONS ON MacOS
        this.setIconImage(new ImageIcon("icon.png").getImage());
        this.setVisible(true);
    }
    public void processInput() {};
    public void update() {};
    public void render() {};
}
