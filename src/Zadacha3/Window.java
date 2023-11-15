package Zadacha3;

import javax.swing.*;
import java.awt.*;
public class Window {
    static JFrame frame = new JFrame("Animation");
    static JPanel panel = new JPanel();
    static JLabel im = new JLabel(new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Java5\\src\\Zadacha4\\1.jpg"));
    static ImageIcon im1 = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Java5\\src\\Zadacha4\\1.jpg");
    static ImageIcon im2 = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Java5\\src\\Zadacha4\\2.jpg");
    public static void main(String[] args) {
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel.setPreferredSize(new Dimension(800,499));
        frame.getContentPane().add(panel);
        frame.add(im);
        frame.pack();
        frame.setVisible(true);
        while(true){
            im.setIcon(im2);
            im.setIcon(im1);
        }
    }
}
