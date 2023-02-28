package practice.GUIStuffs;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.Border;

public class GUILabel 
{
    public static void main(String[] args)
    {
        Border border = BorderFactory.createLineBorder(new Color(0x000000), 10); // Create a border
        ImageIcon icon = new ImageIcon("C:/Users/warri/Pictures/Screenshots/Screenshot (1).png");
        Image image = icon.getImage();
        ImageIcon resize = new ImageIcon(image.getScaledInstance(1280, 720, Image.SCALE_AREA_AVERAGING)); // Make new Image Icon same as the resized image
        JLabel label = new JLabel(); // Create a label
        label.setText("Demon Slayer is Awesome"); // Create a text for the label
        label.setIcon(resize);
        label.setHorizontalTextPosition(JLabel.CENTER); // The options are left, right, center
        label.setVerticalTextPosition(JLabel.TOP); // The options are top, bottom, center
        label.setForeground(new Color(0xffffff)); // Set text color
        label.setFont(new Font("MV Boli", Font.BOLD, 50)); // Set font style
        label.setOpaque(true); // Set trasparency of the background
        label.setBorder(border); // Set a border
        label.setBackground(new Color(0x000000)); // Set label background color
        label.setHorizontalAlignment(JLabel.CENTER); // Set Image Horizontal Position
        label.setVerticalAlignment(JLabel.CENTER); // Set Image Vertical Position 

        JFrame frame = new JFrame();
        frame.setTitle("My First Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // Size of the frame adjusts itself to label
    }
}
