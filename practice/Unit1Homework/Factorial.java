package practice.Unit1Homework;


import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = getPositiveInteger(scan);
        System.out.println(factorial(input));
        scan.close();
    }
    public static int getPositiveInteger(Scanner scan)
    {
        int number;
        do 
        {
            System.out.print("Enter a Positive Integer: ");
            number = scan.nextInt();
        }
        while (number < 0);
        return number;
    }
    public static int factorial(int input)
    {
        int result = 1;
        for (int i = 2; i <= input; i++)
            result *= i;
        return result;
    }
}