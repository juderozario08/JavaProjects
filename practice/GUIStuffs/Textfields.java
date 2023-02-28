package practice.GUIStuffs;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import MyLibs.Words;

class MyFrame extends JFrame implements ActionListener{

    JButton button = new JButton("Submit");
    JTextField textfield = new JTextField();

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button.addActionListener(this);

        textfield.setPreferredSize(new Dimension(250,40));
        textfield.setFont(new Font("Consolas", Font.PLAIN, 25));
        textfield.setForeground(Color.GREEN);
        textfield.setBackground(Color.BLACK);
        textfield.setCaretColor(Color.WHITE);
        textfield.setText("Username");

        this.add(button);
        this.add(textfield);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Welcome " + Words.capitalizeFirstLetter(textfield.getText()));
            textfield.setEditable(false);
            button.setEnabled(false);
        }
    }
}

public class Textfields {
    public static void main(String[] args){
        new MyFrame();
    }
}
