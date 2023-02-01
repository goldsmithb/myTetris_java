package org.example;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public Game() {
        this.setTitle("myTetris");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component emptyLabel = new Label();
        this.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
    public void processInput() {};
    public void update() {};
    public void render() {};
}
