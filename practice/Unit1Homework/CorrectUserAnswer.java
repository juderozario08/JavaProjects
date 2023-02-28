package practice.Unit1Homework;


import java.util.Scanner;

public class CorrectUserAnswer 
{
    public static void main(String[] args)
    {
        int min = 0;
        int max = 100;
        int num1 = (int)(Math.random() * (max-min+1) + min);
        int num2 = (int)(Math.random() * (max-min+1) + min);
        System.out.println("The numbers are " + num1 + "," +num2);
        Scanner scan = new Scanner(System.in);
        double[] answer = new double[10];
        double[] result = new double[10];
        for (int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                result[i] = num1+num2;
                System.out.print("Enter the answer for " +num1+ " + " +num2+": ");
                answer[i] = scan.nextDouble();
            }
            else if (i == 1)
            {    
                result[i] = num1-num2;
                System.out.print("Enter the answer for " +num1+ " - " +num2+": ");
                answer[i] = scan.nextDouble();
            }
            else if (i == 2)
            {    
                result[i] = num1*num2;
                System.out.print("Enter the answer for " +num1+ " * " +num2+": ");
                answer[i] = scan.nextDouble();
            }
            else if (i == 3)
            {    
                result[i] = Math.round((double)num1/(double)num2);
                System.out.print("Enter the answer for " +num1+ " / " +num2+" to the nearest whole number: ");
                answer[i] = scan.nextDouble();
            }   
        }
        for (int i = 0; i < 4; i++)
        {
            if (result[i] != answer[i])
                System.out.println("You answer was " +answer[i]+ " but the correct answer is " +result[i]);
            else if (i == 3 && result[i] == answer[i])
                System.out.println("All of your answers are correct");
        }
        scan.close();
    }
}
