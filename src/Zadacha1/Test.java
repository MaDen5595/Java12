package Zadacha1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Test extends JPanel {
    private ArrayList<Shape> shapes;

    public Test() {
        shapes = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 400);
            int y = (int) (Math.random() * 400);
            int size = (int) (Math.random() * 50) + 20;

            double rand = Math.random();
            if (rand < 0.33) {
                shapes.add(new Circle(x, y, size));
            } else if (rand < 0.66) {
                shapes.add(new Rectangle(x, y, size, size));
            } else {
                shapes.add(new Triangle(x, y, size));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Рандомчик");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Test());
            frame.setSize(600, 600);
            frame.setVisible(true);
        });
    }
}
