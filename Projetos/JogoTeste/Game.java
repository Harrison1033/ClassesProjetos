import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import javax.sound.sampled.*;

public class Game extends JPanel implements ActionListener, KeyListener {
    private javax.swing.Timer timer;
    private ArrayList<Zombie> zombies;
    private ArrayList<Bullet> bullets;
    private Player player;
    private boolean isRunning;
    private boolean isInMenu;
    private Image backgroundImage;
    private Image menuBackgroundImage; // Nova variável para a imagem do menu
    private ArrayList<Obstacle> obstacles;
    private int score;
    private Rectangle startButton;
    private Rectangle exitButton;
    private Rectangle menuButton;
    private Clip backgroundMusic;

    public Game() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        score = 0;

        startButton = new Rectangle(300, 250, 200, 50);
        exitButton = new Rectangle(300, 350, 200, 50);
        menuButton = new Rectangle(300, 400, 200, 50);
        isInMenu = true;
        isRunning = false;

        // Inicializa a música de fundo
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("obscuro.wav"));
            backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(audioStream);
            // Loop contínuo
            backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println("Erro ao carregar música de fundo: " + e.getMessage());
        }

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (isInMenu) {
                    if (startButton.contains(e.getPoint())) {
                        startGame();
                    } else if (exitButton.contains(e.getPoint())) {
                        System.exit(0);
                    }
                } else if (!isRunning && menuButton.contains(e.getPoint())) {
                    isInMenu = true;
                }
            }
        });

        try {
            backgroundImage = new ImageIcon("background.jpg").getImage();
            menuBackgroundImage = new ImageIcon("zombieFundo.jpg").getImage(); // Carrega a imagem do menu
            System.out.println("Imagens carregadas com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao carregar imagens de fundo: " + e.getMessage());
            backgroundImage = null;
            menuBackgroundImage = null;
        }

        timer = new javax.swing.Timer(16, this);
        timer.start();
    }

    private void startGame() {
        if (backgroundMusic != null) {
            backgroundMusic.setFramePosition(0);
            backgroundMusic.start();
        }
        isInMenu = false;
        isRunning = true;
        score = 0;
        player = new Player(400, 300);
        zombies = new ArrayList<>();
        bullets = new ArrayList<>();
        obstacles = new ArrayList<>();
        
        // Recarregar a imagem de fundo do jogo
        try {
            backgroundImage = new ImageIcon("background.jpg").getImage();
        } catch (Exception e) {
            System.out.println("Erro ao carregar imagem de fundo do jogo: " + e.getMessage());
        }
        
        createObstacles();
        spawnZombie();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isInMenu) {
            // Desenha o fundo do menu usando a imagem do menu
            if (menuBackgroundImage != null) {
                g.drawImage(menuBackgroundImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                // Fallback para cor sólida se a imagem não carregar
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
            
            g.setColor(Color.GREEN);
            g.setFont(new Font("Arial", Font.BOLD, 48));
            g.drawString("Zombie Game", 250, 150);

            // Botão Start
            g.setColor(Color.WHITE);
            g.fill3DRect(startButton.x, startButton.y, startButton.width, startButton.height, true);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("Start Game", startButton.x + 45, startButton.y + 35);

            // Botão Exit
            g.setColor(Color.WHITE);
            g.fill3DRect(exitButton.x, exitButton.y, exitButton.width, exitButton.height, true);
            g.setColor(Color.BLACK);
            g.drawString("Exit", exitButton.x + 75, exitButton.y + 35);
            return;
        }

        // Desenha a imagem de fundo primeiro
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }

        // Desenha as estradas por cima do fundo
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 250, 800, 100);  // Estrada horizontal
        g.fillRect(350, 0, 100, 600);  // Estrada vertical

        // Desenha os obstáculos
        for (Obstacle obstacle : obstacles) {
            obstacle.draw(g);
        }

        // Desenha os zumbis
        for (Zombie zombie : zombies) {
            zombie.draw(g);
        }

        // Desenha as balas
        for (Bullet bullet : bullets) {
            bullet.draw(g);
        }

        // Desenha o jogador
        player.draw(g);

        // Desenha HP e Score
        g.setColor(Color.WHITE);
        g.drawString("HP: " + player.getHp(), 20, 20);
        g.drawString("Score: " + score, 20, 40);

        if (!isRunning && !isInMenu) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 48));
            g.drawString("GAME OVER", 260, 300);
            g.setFont(new Font("Arial", Font.BOLD, 24));
            g.drawString("Final Score: " + score, 320, 350);

            // Botão de Menu
            g.setColor(Color.WHITE);
            g.fill3DRect(menuButton.x, menuButton.y, menuButton.width, menuButton.height, true);
            g.setColor(Color.BLACK);
            g.drawString("Menu Principal", menuButton.x + 14, menuButton.y + 35);
        }
    }

    // Obstáculos
    private void createObstacles() {
        obstacles.add(new Obstacle(100, 145, 80, 80));
        obstacles.add(new Obstacle(230, 140, 100, 90));
        obstacles.add(new Obstacle(490, 125, 120, 100));
        obstacles.add(new Obstacle(240, 370, 90, 80));
    }

    private void updateGame() {
        int nextX = player.getNextX();
        int nextY = player.getNextY();
        boolean canMove = true;

        for (Obstacle obstacle : obstacles) {
            if (obstacle.collidesWith(nextX, nextY, 30, 30)) {
                canMove = false;
                break;
            }
        }

        if (canMove) {
            player.update();
        }

        // Atualiza zumbis
        for (int i = zombies.size() - 1; i >= 0; i--) {
            Zombie zombie = zombies.get(i);
            zombie.update(player, obstacles);
        }

        for (int i = bullets.size() - 1; i >= 0; i--) {
            Bullet bullet = bullets.get(i);
            bullet.update();

            if (bullet.isOutOfBounds()) {
                bullets.remove(i);
                continue;
            }

            for (int j = zombies.size() - 1; j >= 0; j--) {
                Zombie zombie = zombies.get(j);
                if (bullet.collidesWith(zombie)) {
                    bullets.remove(i);
                    zombie.hit();  // Reduz a vida do zumbi em 1
                    
                    if (zombie.isDead()) {  // Só remove o zumbi se ele morrer
                        zombies.remove(j);
                        score += 100;
                        spawnZombie();
                    }
                    break;
                }
            }
        }

        for (Zombie zombie : zombies) {
            if (player.collidesWith(zombie)) {
                player.damage();
                if (player.getHp() <= 0) {
                    isRunning = false;
                }
                break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isRunning) {
            updateGame();
        }
        repaint();
    }

    private void spawnZombie() {
        Random random = new Random();
        int x, y;
        
        // Dimensões fixas para evitar o erro de bound must be positive
        int width = 800;
        int height = 600;
        
        // Gera posição aleatória nas bordas
        if (random.nextBoolean()) {
            x = random.nextBoolean() ? 0 : width - 30; // Ajuste para o tamanho do zumbi
            y = random.nextInt(height - 30); // Ajuste para o tamanho do zumbi
        } else {
            x = random.nextInt(width - 30); // Ajuste para o tamanho do zumbi
            y = random.nextBoolean() ? 0 : height - 30; // Ajuste para o tamanho do zumbi
        }

        // Gera um número aleatório para determinar o tipo de zumbi
        double zombieType = random.nextDouble();
        
        if (zombieType < 0.15) {  // 15% de chance de ser um Tank Zombie
            zombies.add(new TankZombie(x, y));
        } else if (zombieType < 0.45) {  // 30% de chance de ser um Strong Zombie
            zombies.add(new StrongZombie(x, y));
        } else {  // 55% de chance de ser um Normal Zombie
            zombies.add(new NormalZombie(x, y));
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!isRunning) return;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                player.setMovingUp(true);
                break;
            case KeyEvent.VK_S:
                player.setMovingDown(true);
                break;
            case KeyEvent.VK_A:
                player.setMovingLeft(true);
                break;
            case KeyEvent.VK_D:
                player.setMovingRight(true);
                break;
            case KeyEvent.VK_SPACE:
                bullets.add(player.shoot());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                player.setMovingUp(false);
                break;
            case KeyEvent.VK_S:
                player.setMovingDown(false);
                break;
            case KeyEvent.VK_A:
                player.setMovingLeft(false);
                break;
            case KeyEvent.VK_D:
                player.setMovingRight(false);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zombie Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new Game());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}