package practice.GUIStuffs;
import javax.swing.*;
import java.awt.*;

public class gridLayout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // new GridLayout(rows, colums, horizontal spacing, vertical spacing)
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        frame.add(new JButton("Button 7"));
        frame.add(new JButton("Button 8"));
        frame.add(new JButton("Button 9"));
        frame.add(new JButton("Button 10"));

        frame.setVisible(true);
    }
}
