package Zadacha2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Window {
    static JFrame frame = new JFrame("Kartinka");
    static JPanel panel = new JPanel();
    static JLabel im = new JLabel(new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Java5\\src\\Zadacha4\\1.jpg"));
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input picture url:");
        String url = scan.nextLine();
        ImageIcon imm = new ImageIcon(url);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel.setPreferredSize(new Dimension(300,300));
        frame.getContentPane().add(panel);
        im.setIcon(imm);
        frame.add(im);
        frame.pack();
        frame.setVisible(true);

    }
}

