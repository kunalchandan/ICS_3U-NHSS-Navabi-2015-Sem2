import java.awt.*;
public class Diamond {
  private int xPos, yPos, width, height;
  private Color col;
  private Polygon p = new Polygon();
  public Diamond(int a, int b, int c, int d) {
    xPos = a;
    yPos = b;
    width = c;
    height = d;
  }
  public Diamond() {
    xPos = 10;
    yPos = 10;
    width = 50;
    height = 50;
  }
  public void drawDiamond(Graphics2D g2) {
    g2.setColor(col);
    p.addPoint(xPos + width / 2, yPos);
    p.addPoint(xPos, yPos + height / 2);
    p.addPoint(xPos + width / 2, yPos + height);
    p.addPoint(xPos + width, yPos + height / 2);
    g2.drawPolygon(p);
  }
  public void fillDiamond(Graphics2D g2) {
    g2.setColor(col);
    p.addPoint(xPos + width / 2, yPos);
    p.addPoint(xPos, yPos + height / 2);
    p.addPoint(xPos + width / 2, yPos + height);
    p.addPoint(xPos + width, yPos + height / 2);
    g2.fillPolygon(p);
  }
  public void addPoints() {
    p.addPoint(xPos + width / 2, yPos);
    p.addPoint(xPos, yPos + height / 2);
    p.addPoint(xPos + width / 2, yPos + height);
    p.addPoint(xPos + width, yPos + height / 2);
  }
  public void setX(int x) {
    xPos = x;
  }
  public void setY(int y) {
    yPos = y;
  }
  public void setWidth(int w) {
    width = w;
  }
  public void setHeight(int h) {
    height = h;
  }
  public void setColor(Color c) {
    col = c;
  }
  public int getX() {
    return xPos;
  }
  public int getY() {
    return yPos;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  public Color getColor() {
    return col;
  }
}