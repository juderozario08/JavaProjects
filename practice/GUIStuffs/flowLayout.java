package practice.GUIStuffs;

import java.awt.*;
import javax.swing.*;

public class flowLayout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // FlowLayout(position, width spacing, height spacing)
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));
        frame.add(panel);
        frame.setVisible(true);
    }    
}
