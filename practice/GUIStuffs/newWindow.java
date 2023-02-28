package practice.GUIStuffs;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Window{
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    Window(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420,420));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

class LaunchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    
    LaunchPage(){
        
        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.add(button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420,420));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            frame.dispose(); // Closes current frame
            new Window();
        }
    }
}

public class newWindow {
    public static void main(String[] args){
        new LaunchPage();
    }
    
}
