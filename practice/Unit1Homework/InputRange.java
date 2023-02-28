package practice.Unit1Homework;


import java.util.Scanner;

public class InputRange 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a minimum number: ");
        int min = scan.nextInt();
        System.out.print("Enter a maximum number: ");
        int max = scan.nextInt();
        int input;
        do 
        {
            System.out.print("Enter a number between " +max+ " and "+min+": ");
            input = scan.nextInt();
        }
        while (input <= min || input >= max);
        System.out.println("The number you chose is "+input);
        scan.close();
    }
}
