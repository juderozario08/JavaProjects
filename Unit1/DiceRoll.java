package Unit1;

import java.util.Random;

public class DiceRoll 
{
    public static void main(String[] args)
    {
        Random rand = new Random();// Create a random fucntion
        System.out.println("Dice 1    Dice 2    Total");
        Dices(rand); // Call this dice function to print out the random dices and the total
    }
    public static void Dices(Random rand)
    {
        // Initialize the variables
        int dice1;
        int dice2;
        for (int i = 0; i < 5; i++)
        {
            dice1 = rand.nextInt(6)+1; // Get a positive integer between 1 to 6 both inclusive
            dice2 = rand.nextInt(6)+1;
            // Print the output
            System.out.println("  "+dice1+"         "+dice2+"        "+(dice1+dice2));
        }       
    }
}
