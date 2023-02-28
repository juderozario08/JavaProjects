package Unit3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        System.out.println();

        // Create a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String you want to reverse: ");

        // Prompt user for a string
        String str = input.nextLine();
        System.out.println();
        System.out.print("Reversed String: ");

        // Use the custom class to reverse the string
        System.out.print(Words.reverse(str)); 

        System.out.println("\n");
        input.close();
    }
}

class Words{

    public static String reverse(String input){
        String result = "";
        // Go through the user input from the ending and concatitate that char with result
        for (int i = input.length()-1; i >= 0; i--)
            result += input.charAt(i);
        return result;
    }
}
