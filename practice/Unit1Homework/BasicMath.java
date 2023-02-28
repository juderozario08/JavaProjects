package practice.Unit1Homework;


import java.util.Scanner;

public class BasicMath 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Create a scanner 
        int num1 = getPositiveInteger(scan); // Get a valid integer by passing scanner 
        int num2 = getPositiveInteger(scan);
        System.out.println(num1 + " + " + num2 + " = " +(num1+num2)); // Add 2 numbers 
        System.out.println(num1 + " - " + num2 + " = " +(num1-num2)); // Subtract 2 numbers
        System.out.println(num1 + " * " + num2 + " = " +(num1*num2)); // Multiply 2 numbers
        System.out.println(num1 + " / " + num2 + " = " +((float)num1/(float)num2)); // Divide 2 numbers
        System.out.println(num1 + " ^ " + num2 + " = " +Math.pow(num1, num2)); // Use 2nd input as an Exponent for the 1st input
        scan.close(); // Close the scanner
    }
    public static int getPositiveInteger(Scanner scan)
    {
        int number;
        do 
        {
            System.out.print("Enter a number: ");
            number = scan.nextInt();
        }
        while(number < 1 || number > 9);
        return number;
    }
}
