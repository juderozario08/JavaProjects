package practice.Unit2Homework;

import java.util.Scanner;

public class DigitExtractor
{
    int number;
    int ones;
    int tens; 
    int hundreds;
    public DigitExtractor(int num)
    {
        this.number = num;
        ones = num%10;
        num/=10;
        tens = num%10;
        num/=10;
        hundreds = num%10;
    }
    int WholeNumber()
    {
        return number;
    }
    int ReturnOnes()
    {
        return ones;
    }
    int ReturnTens()
    {
        return tens;
    }
    int ReturnHundreds()
    {
        return hundreds;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = getPositiveInt(scan);
        System.out.println("(1) for Printing Ones place");
        System.out.println("(2) for Printing Tens place");
        System.out.println("(3) for Printing Hundreds place");
        System.out.println("(4) for Printing Whole Number place");
        System.out.println("(5) to Quit");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        DigitExtractor extract = new DigitExtractor(num);
        if (choice == 5)
            System.exit(1);
        else if (choice == 1)
            System.out.println("Ones: " +extract.ReturnOnes());
        else if (choice == 2 && num > 9)
            System.out.println("Tens: "+extract.ReturnTens());
        else if (choice == 2 && num < 10)
            System.out.println("Number does not contain a Tens place.");
        else if (choice == 3 && num > 99)
            System.out.println("Hundreds: "+extract.ReturnHundreds());
        else if (choice == 3 && num < 100)
            System.out.println("Number does not contain a hundreds place.");
        else if (choice == 4)
            System.out.println("Whole Number: "+extract.WholeNumber());
    }
    public static int getPositiveInt(Scanner scan)
    {
        int number;
        do 
        {
            System.out.print("Enter a positive number less than 1000: ");
            number = scan.nextInt();
        }
        while(number < 0 || number > 999);
        return number;
    }
}