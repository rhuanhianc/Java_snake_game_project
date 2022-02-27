package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts =6;
    int foodEate;
    int foodX;
    int foodY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        gameStart();

    }
    public void gameStart(){
        
    }
    public void paintComponent(Graphics g) {

    }
    public void draw(Graphics g) {

    }
    public void move() {

    }
    public void checkCollision() {

    }
    public void checkFood() {

    }
    public void gameOver() {

    }

    public void actionPerformed(java.awt.event.ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}
