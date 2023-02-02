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
    protected final int FPS = 60;
    private Arena arena;
    private State state = State.GAMEOVER;
    public Game() {
        initUI();
        start();
        play();
    }

    private void initUI() {
        this.setTitle("myTetris");
        this.setSize(new Dimension (400, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Component emptyLabel = new Label();
        this.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        // center window in screen
        this.setLocationRelativeTo(null);
    }

    private void start() {
        setGameState(State.PLAYING);
        arena = new Arena();

        this.add(arena);

        this.setVisible(true);
    }

    private void play() {
        long frameLength = 1000 / FPS;
        long sleepTime;
        long nextFrameAt;
        long current;

        while(state == State.PLAYING) {
            processInput();
            update();
            render();

            current = System.currentTimeMillis();
            nextFrameAt = current + frameLength;
            sleepTime = nextFrameAt - System.currentTimeMillis();

            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }


        }

    }

    public void setGameState(State s) { state = s; }
    public State getGameState() { return state; }
    public void processInput() {};
    public void update() {};
    public void render() {
        arena.repaint();
    };
}
