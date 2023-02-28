package practice.GUIStuffs;


import java.awt.Color;
import java.awt.Image;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {
    // Panels are a GUI function that works as a container to hold other components
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:/Users/warri/Pictures/Screenshots/Screenshot (1).png");
        Image image = icon.getImage();
        ImageIcon resize = new ImageIcon(image.getScaledInstance(320, 230, Image.SCALE_AREA_AVERAGING));

        JLabel label = new JLabel();
        label.setIcon(resize);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK); // Set the background to a color
        blackPanel.setBounds(0, 0, 800, 600); // Position and size of the panel

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(90, 50, 600, 450);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(165, 100, 450, 336);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(225, 140, 336, 252);
        // Create a layout and then add a border layout
        whitePanel.setLayout(new BorderLayout());

        // If layout is null, then set bounds on the label and add to whatever panel we
        // want to add.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 600);
        frame.setTitle("Panels");
        frame.setResizable(true);
        frame.setVisible(true);

        // Add label to the panel
        whitePanel.add(label);

        // Add components to the frame
        frame.add(whitePanel);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(blackPanel);
    }
}