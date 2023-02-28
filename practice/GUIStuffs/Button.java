package practice.GUIStuffs;


import java.awt.event.*;

import java.awt.Image;
import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonParts extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ButtonParts() {

        ImageIcon icon = new ImageIcon("C:/Users/warri/Pictures/Screenshots/Screenshot (1).png");
        Image image = icon.getImage();
        ImageIcon resize = new ImageIcon(image.getScaledInstance(100, 50, Image.SCALE_AREA_AVERAGING));

        ImageIcon icon2 = new ImageIcon("C:/Users/warri/Downloads/v2mtx75y.jpg");
        Image image2 = icon2.getImage();
        ImageIcon resize2 = new ImageIcon(image2.getScaledInstance(250, 150, Image.SCALE_AREA_AVERAGING));

        label = new JLabel();
        // Set the image for the label
        label.setIcon(resize2);
        // Set bounds for the label
        label.setBounds(100, 250, 250, 150);
        // Set its visibility
        label.setVisible(false);

        button = new JButton(); // Create a button
        button.setBounds(100, 100, 250, 100); // Set bounds of the button

        // e-> is a lambda expression and this listens to the button and outputs poo
        button.addActionListener(this);

        // Set a text on the button
        button.setText("I'm a button");

        // Setting focus to false to remove the white background from the text
        button.setFocusable(false);

        // Set an icon in a button
        button.setIcon(resize);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));

        // Set gap between icon and text
        button.setIconTextGap(-2);

        // Set text color
        button.setForeground(Color.BLACK);
        button.setBackground(Color.YELLOW);

        // Set border for the button
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Demon Slayer");
            // After button click set visibility to true
            label.setVisible(true);
        }
    }
}

public class Button {
    public static void main(String[] args) {
        new ButtonParts();
    }
}
