package practice.GUIStuffs;

import javax.swing.*;
import java.awt.*;

public class LayeredPane{
    public static void main(String[] args){
        /*
            JLayeredPane is a swing container that provides a third
            dimension for positioning components. ex: depth, z-index
        */

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLACK);
        label2.setBounds(100,100,200,200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GRAY);
        label3.setBounds(150,150,200,200);

        // Integer.valueOf(), JLayeredPane.DRAG_LAYER
        // These are used to set layers for where the component will be visible
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}