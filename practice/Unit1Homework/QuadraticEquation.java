package practice.Unit1Homework;


import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scan.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scan.nextDouble();
        PositiveQuadraticFormula(a, b, c);
        NegativeQuadraticFormula(a, b, c);
        scan.close();
    }
    public static void PositiveQuadraticFormula(double a, double b, double c)
    {
        double insideRoot = Math.pow(b, 2) - (4 * a * c);
        if (insideRoot < 0)
        {
            System.out.println ("Invalid Equation");
            return;
        }
        double result = (((-1)*(b)) + Math.sqrt(insideRoot))/(2*a);
            System.out.println("One of the values are: "+result);
            return;
    }
    public static void NegativeQuadraticFormula(double a, double b, double c)
    {
        double insideRoot = Math.pow(b, 2) - (4 * a * c);
        if (insideRoot < 0)
        {
            System.out.println ("Invalid Equation");
            return;
        }
        double result = (((-1)*(b)) - Math.sqrt(insideRoot))/(2*a);
            System.out.println("The other value is: "+result);
            return;
    }
}
