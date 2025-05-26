import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.sound.sampled.*;
import java.io.File;

public class Bullet {
    private int x, y;
    private int speed;
    private int direction; // 0=up, 1=right, 2=down, 3=left
    private static final int SIZE = 5;
    private static Clip shootSound;
    
    static {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("tiro.WAV"));
            shootSound = AudioSystem.getClip();
            shootSound.open(audioStream);
        } catch (Exception e) {
            System.out.println("Erro ao carregar som de tiro: " + e.getMessage());
        }
    }

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = 10;
        
        // Toca o som de tiro
        if (shootSound != null) {
            if (shootSound.isRunning()) {
                shootSound.stop();
            }
            shootSound.setFramePosition(0);
            shootSound.start();
        }
    }

    public void update() {
        switch (direction) {
            case 0: // up
                y -= speed;
                break;
            case 1: // right
                x += speed;
                break;
            case 2: // down
                y += speed;
                break;
            case 3: // left
                x -= speed;
                break;
        }
    }

    public boolean isOutOfBounds() {
        return x < 0 || x > 800 || y < 0 || y > 600;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, SIZE, SIZE);
    }

    public boolean collidesWith(Zombie zombie) {
        Rectangle bulletBounds = new Rectangle(x, y, SIZE, SIZE);
        Rectangle zombieBounds = new Rectangle(zombie.getX(), zombie.getY(), 30, 30);
        return bulletBounds.intersects(zombieBounds);
    }
}