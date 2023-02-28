package practice.GUIStuffs;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Create a frame
        frame.setTitle("My First Panel"); // Set a titile
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close operation
        frame.setSize(800, 600); // Set window size
        ImageIcon icon = new ImageIcon("C:/Users/warri/Pictures/Screenshots/Screenshot (1).png"); // Get icon
        frame.setIconImage(icon.getImage()); // Set the icon
        frame.setResizable(false); // Resize window options
        frame.getContentPane().setBackground(new Color(0x123456)); // Set background color
        frame.setVisible(true); // Set the visibility
    }
}
