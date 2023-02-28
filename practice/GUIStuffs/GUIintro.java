package practice.GUIStuffs;

import javax.swing.JOptionPane;

public class GUIintro
{
    public static void main(String[] args)
    {
        /* 
            JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE,
            JOptionPane.QUESTION_MESSAGE, JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE
        
            String name = JOptionPane.showInputDialog("Enter your name");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        
            JOptionPane.showMessageDialog(null, "Hello " +name+ ". \nYou are "+age+" years old. \nYour height is "+height+" cm.", "Title", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Hello " +name+ ". \nYou are "+age+" years old. \nYour height is "+height+" cm.", "Title", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "Hello " +name+ ". \nYou are "+age+" years old. \nYour height is "+height+" cm.", "Title", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Hello " +name+ ". \nYou are "+age+" years old. \nYour height is "+height+" cm.", "Title", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Hello " +name+ ". \nYou are "+age+" years old. \nYour height is "+height+" cm.", "Title", JOptionPane.QUESTION_MESSAGE);
            
            System.out.println(JOptionPane.showConfirmDialog(null, 
            "Call tech support NOW?", 
            "Title", 
            JOptionPane.ERROR_MESSAGE));
        */
        
        String[] responses = {"Oui", "Non", "Not Needed"};

        System.out.println(JOptionPane.showOptionDialog(null, 
        "Show all options!!", 
        "Secret Message", 
        JOptionPane.YES_NO_CANCEL_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        responses, 0));
    }
}