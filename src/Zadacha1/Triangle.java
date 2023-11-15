package Zadacha1;

import java.awt.*;

class Triangle extends Shape {
    private int[] xPoints, yPoints;

    public Triangle(int x, int y, int size) {
        super(x, y);
        xPoints = new int[]{x, x + size, x + size / 2};
        yPoints = new int[]{y, y, y - size};
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
