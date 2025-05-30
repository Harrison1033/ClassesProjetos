import java.awt.Color;
import java.awt.Graphics;

public class Obstacle {
    private int x, y;
    private int width, height;

    public Obstacle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }

    public boolean collidesWith(int px, int py, int pwidth, int pheight) {
        return px < x + width && px + pwidth > x &&
               py < y + height && py + pheight > y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}