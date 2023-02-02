package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;

public class Game extends JFrame {
    public enum State { PLAYING, GAMEOVER }

    private State state = State.GAMEOVER;
    public Game() {
        initUI();
        Arena p = new Arena();

        this.add(p);
        this.setVisible(true);
    }

    public void initUI() {
        this.setTitle("myTetris");
        this.setSize(new Dimension (400, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component emptyLabel = new Label();
        this.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        // center window in screen
        this.setLocationRelativeTo(null);
    }

    public void start() {
        setGameState(State.PLAYING);
    }

    public void setGameState(State s) { state = s; }
    public State getGameState() { return state; }
    public void processInput() {};
    public void update() {};
    public void render() {};
}
