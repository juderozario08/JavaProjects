package practice.Unit1Homework;


import java.util.Scanner;

public class PrintingPrices 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of copies you want: ");
        int NumOfCopies = scan.nextInt();
        if (NumOfCopies >= 0 && NumOfCopies <= 99)
        {
            System.out.println("Price per copy is: $0.27");
            System.out.println("Total Cost is: " +NumOfCopies*0.30);
        }
        else if (NumOfCopies >= 100 && NumOfCopies <= 499)
        {
            System.out.println("Price per copy is: $0.27");
            System.out.println("Total Cost is: " +NumOfCopies*0.28);
        }
        else if (NumOfCopies >= 500 && NumOfCopies <= 749)
        {
            System.out.println("Price per copy is: $0.27");    
            System.out.println("Total Cost is: " +NumOfCopies*0.27);
        }
        else if (NumOfCopies >= 750 && NumOfCopies <= 1000)
        {
            System.out.println("Price per copy is: $0.27");    
            System.out.println("Total Cost is: " +NumOfCopies*0.26);
        }
        else if (NumOfCopies > 1000)
        {
            System.out.println("Price per copy is: $0.27");
            System.out.println("Total Cost is: " +NumOfCopies*0.25);
        }
        else
            System.out.println("Number has to be greater than 0.");
        scan.close();
    }    
}
