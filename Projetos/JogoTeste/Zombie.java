import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// Classe abstrata que representa um zumbi no jogo
public abstract class Zombie {
    // Atributos protegidos (acessíveis pelas subclasses)
    protected int x, y;           // Posição do zumbi na tela
    protected int health;         // Pontos de vida do zumbi
    protected int speed;          // Velocidade de movimento
    protected Color color;        // Cor padrão (caso não tenha sprite)
    protected Image sprite;       // Imagem do zumbi (spritesheet)
    protected int currentFrame;   // Frame atual da animação
    protected int frameWidth = 40;  // Largura de cada frame do sprite
    protected int frameHeight = 48; // Altura de cada frame do sprite
    protected int frameDelay;     // Contador para controlar velocidade da animação
    protected int frameCount;     // Contador total de frames
    protected int lastDirection;  // Última direção movida (0=baixo, 1=direita, 2=cima, 3=esquerda)

    // Array que define as sequências de animação para cada direção
    protected int[][] frameSequences = {
        {0, 3},    // baixo (índices 0-3)
        {12, 15},  // direita (índices 12-15)
        {8, 11},   // cima (índices 8-11)
        {4, 7}     // esquerda (índices 4-7)
    };

    // Construtor da classe Zombie
    public Zombie(int x, int y, int health, int speed, Color color, String spritePath) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.speed = speed;
        this.color = color;
        this.currentFrame = 0;
        this.frameDelay = 0;
        this.lastDirection = 0;  // Começa virado para baixo
        
        // Tenta carregar a imagem do sprite
        try {
            this.sprite = new ImageIcon(spritePath).getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar sprite do zumbi: " + e.getMessage());
        }
    }

    // Atualiza o estado do zumbi a cada frame do jogo
    public void update(Player player, ArrayList<Obstacle> obstacles) {
        int nextX = x;  // Próxima posição X
        int nextY = y;  // Próxima posição Y

        // Lógica de perseguição ao jogador (movimento baseado na posição do player)
        if (x < player.getX()) {
            nextX += speed;
            lastDirection = 2; // cima
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
            lastDirection = 1; // direita
        }

        // Verifica colisão com obstáculos antes de mover
        boolean canMove = true;
        for (Obstacle obstacle : obstacles) {
            if (obstacle.collidesWith(nextX, nextY, frameWidth, frameHeight)) {
                canMove = false;
                break;
            }
        }

        // Se não houver colisão, atualiza a posição e animação
        if (canMove) {
            x = nextX;
            y = nextY;
            
            // Atualização da animação (a cada 5 frames do jogo)
            frameDelay++;
            if (frameDelay >= 5) {
                frameDelay = 0;
                int startFrame = frameSequences[lastDirection][0];
                int endFrame = frameSequences[lastDirection][1];
                // Cicla entre os frames da direção atual
                currentFrame = startFrame + ((currentFrame + 1 - startFrame) % (endFrame - startFrame + 1));
            }
        }
    }

    // Desenha o zumbi na tela
    public void draw(Graphics g) {
        if (sprite != null) {
            // Desenha usando spritesheet (animação)
            int sourceX = (currentFrame * frameWidth);
            int sourceY = 0; // todos os frames estão na mesma linha
            g.drawImage(sprite, x, y, x + frameWidth, y + frameHeight,
                       sourceX, sourceY, sourceX + frameWidth, sourceY + frameHeight, null);
        } else {
            // Fallback: desenha um retângulo colorido se não houver sprite
            g.setColor(color);
            g.fillRect(x, y, frameWidth, frameHeight);
        }
    }

    // Método chamado quando o zumbi é atingido
    public void hit() {
        health--;  // Reduz a vida do zumbi
    }

    // Verifica se o zumbi está morto
    public boolean isDead() {
        return health <= 0;
    }

    // Métodos de acesso para posição
    public int getX() { return x; }
    public int getY() { return y; }
}