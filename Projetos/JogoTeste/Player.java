import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Player {
    private int x, y;
    private int hp;
    private int speed;
    private boolean up, down, left, right;
    private int lastDirection; // 0=down, 1=right, 2=up, 3=left
    private Image playerImage;
    private int frameWidth = 40;  // largura de cada frame
    private int frameHeight = 48; // altura de cada frame
    private int currentFrame = 0;
    private int frameDelay = 100; // delay entre frames em milissegundos
    private long lastFrameTime;

    // Arrays para armazenar os índices inicial e final de cada direção
    private int[][] frameSequences = {
        {0, 4},    // baixo (índices 0-3)
        {12, 16},  // direita (índices 12-15)
        {8, 12},   // cima (índices 8-11)
        {4, 8}     // esquerda (índices 4-7)
    };

    public void update() {
        boolean isMoving = up || down || left || right;
        
        if (up) {
            y -= speed;
            lastDirection = 1; // cima
        }
        if (down) {
            y += speed;
            lastDirection = 0; // baixo
        }
        if (left) {
            x -= speed;
            lastDirection = 3; // esquerda
        }
        if (right) {
            x += speed;
            lastDirection = 2; // direita
        }

        // Atualiza o frame da animação
        if (isMoving && System.currentTimeMillis() - lastFrameTime > frameDelay) {
            int startFrame = frameSequences[lastDirection][0];
            int endFrame = frameSequences[lastDirection][1];
            
            currentFrame++;
            if (currentFrame >= endFrame) {
                currentFrame = startFrame;
            }
            if (currentFrame < startFrame) {
                currentFrame = startFrame;
            }
            
            lastFrameTime = System.currentTimeMillis();
        } else if (!isMoving) {
            currentFrame = frameSequences[lastDirection][0];
        }
    }

    public void draw(Graphics g) {
        if (playerImage != null) {
            // Calcula a posição do frame no spritesheet
            int frameIndex = currentFrame;
            int sourceX = frameIndex * frameWidth;
            int sourceY = 0; // Todos os frames estão na mesma linha
            
            g.drawImage(playerImage,
                x, y, x + frameWidth, y + frameHeight,
                sourceX, sourceY, sourceX + frameWidth, sourceY + frameHeight,
                null);
        } else {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, frameWidth, frameHeight);
        }
    }

    public Bullet shoot() {
        // Converter a direção do Player para a direção do Bullet
        // Player: 0=baixo, 1=direita, 2=cima, 3=esquerda
        // Bullet: 0=cima, 1=direita, 2=baixo, 3=esquerda
        int bulletDirection;
        switch(lastDirection) {
            case 0: // Player baixo -> Bullet baixo
                bulletDirection = 2;
                break;
            case 1: // Player direita -> Bullet direita
                bulletDirection = 0;
                break;
            case 2: // Player cima -> Bullet cima
                bulletDirection = 1;
                break;
            case 3: // Player esquerda -> Bullet esquerda
                bulletDirection = 3;
                break;
            default:
                bulletDirection = 2; // padrão: baixo
        }
        return new Bullet(x + frameWidth/2, y + frameHeight/2, bulletDirection);
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: up = true; break;
            case KeyEvent.VK_S: down = true; break;
            case KeyEvent.VK_A: left = true; break;
            case KeyEvent.VK_D: right = true; break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: up = false; break;
            case KeyEvent.VK_S: down = false; break;
            case KeyEvent.VK_A: left = false; break;
            case KeyEvent.VK_D: right = false; break;
        }
    }

    public void damage() {
        // Reduz o dano em 80% (aplica apenas 20% do dano original)
        // Dano original era 10, agora será 2 (10 * 0.2)
        hp -= 2;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public int getHp() {
        return hp;
    }

    public boolean collidesWith(Zombie zombie) {
        Rectangle playerBounds = new Rectangle(x, y, 30, 30);
        Rectangle zombieBounds = new Rectangle(zombie.getX(), zombie.getY(), 30, 30);
        return playerBounds.intersects(zombieBounds);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNextX() {
        int nextX = x;
        if (left) nextX -= speed;
        if (right) nextX += speed;
        return Math.max(0, Math.min(800 - 30, nextX));
    }

    public int getNextY() {
        int nextY = y;
        if (up) nextY -= speed;
        if (down) nextY += speed;
        return Math.max(0, Math.min(600 - 30, nextY));
    }

    public void setMovingUp(boolean moving) {
        up = moving;
    }

    public void setMovingDown(boolean moving) {
        down = moving;
    }

    public void setMovingLeft(boolean moving) {
        left = moving;
    }

    public void setMovingRight(boolean moving) {
        right = moving;
    }

    // Adicionar o construtor após a declaração de frameSequences
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.speed = 5;
        this.lastDirection = 0;
        this.lastFrameTime = System.currentTimeMillis();
        
        try {
            playerImage = new ImageIcon("jogador.png").getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar imagem do jogador: " + e.getMessage());
            playerImage = null;
        }
    }
}