// Importações necessárias para a classe
import javax.swing.*;          // Para componentes gráficos
import java.awt.*;             // Para gráficos e componentes AWT
import java.awt.event.*;       // Para eventos
import java.util.*;            // Para utilitários
import javax.sound.sampled.*;  // Para reprodução de áudio
import java.io.File;           // Para manipulação de arquivos

// Classe que representa uma bala no jogo
public class Bullet {
    // Atributos da bala
    private int x, y;          // Posição (coordenadas) da bala
    private int speed;         // Velocidade de movimento da bala
    private int direction;     // Direção da bala: 0=cima, 1=direita, 2=baixo, 3=esquerda
    private static final int SIZE = 5;  // Tamanho fixo da bala (diâmetro do círculo)

    // Clip de áudio estático para o som do tiro (compartilhado por todas as instâncias)
    private static Clip shootSound;

    // Bloco estático de inicialização - executa quando a classe é carregada
    static {
        try {
            // Carrega o arquivo de som do tiro
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("tiro.WAV"));
            // Obtém um Clip de áudio
            shootSound = AudioSystem.getClip();
            // Abre o stream de áudio no Clip
            shootSound.open(audioStream);
        } catch (Exception e) {
            // Em caso de erro ao carregar o som, imprime mensagem (poderia ser tratado melhor)
            System.out.println("Erro ao carregar som de tiro: " + e.getMessage());
        }
    }

    // Construtor da bala
    public Bullet(int x, int y, int direction) {
        // Inicializa posição e direção
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = 10;  // Define velocidade fixa

        // Toca o som de tiro quando a bala é criada
        if (shootSound != null) {
            // Se o som já estiver tocando, para a reprodução
            if (shootSound.isRunning()) {
                shootSound.stop();
            }
            // Reinicia o som do início
            shootSound.setFramePosition(0);
            // Inicia a reprodução do som
            shootSound.start();
        }
    }

    // Atualiza a posição da bala com base na direção
    public void update() {
        switch (direction) {
            case 0: // cima - diminui a coordenada y
                y -= speed;
                break;
            case 1: // direita - aumenta a coordenada x
                x += speed;
                break;
            case 2: // baixo - aumenta a coordenada y
                y += speed;
                break;
            case 3: // esquerda - diminui a coordenada x
                x -= speed;
                break;
        }
    }

    // Verifica se a bala saiu dos limites da tela (considerando tela de 800x600)
    public boolean isOutOfBounds() {
        return x < 0 || x > 800 || y < 0 || y > 600;
    }

    // Desenha a bala na tela
    public void draw(Graphics g) {
        g.setColor(Color.RED);      // Define cor vermelha para a bala
        g.fillOval(x, y, SIZE, SIZE);  // Desenha um círculo preenchido
    }

    // Verifica colisão com um zumbi
    public boolean collidesWith(Zombie zombie) {
        // Cria retângulo de colisão para a bala
        Rectangle bulletBounds = new Rectangle(x, y, SIZE, SIZE);
        // Cria retângulo de colisão para o zumbi (assumindo tamanho 30x30)
        Rectangle zombieBounds = new Rectangle(zombie.getX(), zombie.getY(), 30, 30);
        // Verifica interseção entre os retângulos
        return bulletBounds.intersects(zombieBounds);
    }
}