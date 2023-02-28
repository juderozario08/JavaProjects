package Unit1;

import java.util.Scanner;

public class CountVowels 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Create a scanner 
        System.out.print("Enter the String: ");
        String input = scan.nextLine(); // Get input from the user in the terminal
        System.out.println("User Input: " + input.trim()); // Trim all leading and trailing whitespaces 
        System.out.println("Vowel Counter: " + CountingVowels(input.toLowerCase())); // Call the Counting Vowels function to print the number of vowels
        scan.close();
    }
    public static int CountingVowels(String input)
    {
        int counter = 0;
        for (int i = 0; i < input.length(); i++)
        {
            // In a forloop, iterate through each letter and check if it is a vowel and increase the counter.
            switch(input.charAt(i))
            {
                case 'a': counter++;
                break;
                case 'e': counter++;
                break;
                case 'i': counter++;
                break;
                case 'o': counter++;
                break;
                case 'u': counter++;
                break; 
            }
        }
        return counter;
    }
}
