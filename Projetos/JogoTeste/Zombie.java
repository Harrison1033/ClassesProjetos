import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public abstract class Zombie {
    protected int x, y;
    protected int health;
    protected int speed;
    protected Color color;
    protected Image sprite;
    protected int currentFrame;
    protected int frameWidth = 40;  // ajuste conforme o tamanho real do seu sprite
    protected int frameHeight = 48; // ajuste conforme o tamanho real do seu sprite
    protected int frameDelay;
    protected int frameCount;
    protected int lastDirection; // 0=baixo, 1=direita, 2=cima, 3=esquerda

    // Arrays para armazenar os índices inicial e final de cada direção (16 frames total, 4 por direção)
    protected int[][] frameSequences = {
        {0, 3},    // baixo (índices 0-3)
        {12, 15},  // direita (índices 12-15)
        {8, 11},   // cima (índices 8-11)
        {4, 7}     // esquerda (índices 4-7)
    };

    public Zombie(int x, int y, int health, int speed, Color color, String spritePath) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.speed = speed;
        this.color = color;
        this.currentFrame = 0;
        this.frameDelay = 0;
        this.lastDirection = 0;
        
        try {
            this.sprite = new ImageIcon(spritePath).getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar sprite do zumbi: " + e.getMessage());
        }
    }

    public void update(Player player, ArrayList<Obstacle> obstacles) {
        int nextX = x;
        int nextY = y;

        // Calcula próxima posição e direção
        if (x < player.getX()) {
            nextX += speed;
            lastDirection = 2; // direita
        }
        if (x > player.getX()) {
            nextX -= speed;
            lastDirection = 3; // esquerda
        }
        if (y < player.getY()) {
            nextY += speed;
            lastDirection = 0; // baixo
        }
        if (y > player.getY()) {
            nextY -= speed;
            lastDirection = 1; // cima
        }

        // Verifica colisão com obstáculos
        boolean canMove = true;
        for (Obstacle obstacle : obstacles) {
            if (obstacle.collidesWith(nextX, nextY, frameWidth, frameHeight)) {
                canMove = false;
                break;
            }
        }

        // Só move se não houver colisão
        if (canMove) {
            x = nextX;
            y = nextY;
            
            // Atualiza frame da animação
            frameDelay++;
            if (frameDelay >= 5) {
                frameDelay = 0;
                int startFrame = frameSequences[lastDirection][0];
                int endFrame = frameSequences[lastDirection][1];
                currentFrame = startFrame + ((currentFrame + 1 - startFrame) % (endFrame - startFrame));
            }
        }
    }

    public void draw(Graphics g) {
        if (sprite != null) {
            int sourceX = (currentFrame * frameWidth);
            int sourceY = 0; // todos os frames estão na mesma linha
            g.drawImage(sprite, x, y, x + frameWidth, y + frameHeight,
                       sourceX, sourceY, sourceX + frameWidth, sourceY + frameHeight, null);
        } else {
            g.setColor(color);
            g.fillRect(x, y, frameWidth, frameHeight);
        }
    }

    public void hit() {
        health--;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}