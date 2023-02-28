package practice.Unit1Homework;


import java.util.Scanner;

public class Circle 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = scan.nextDouble();
        System.out.println("The circumference of the circle is "+ (Math.PI*(2*radius)));
        System.out.println("The circumference of the circle is "+ (Math.PI * Math.pow(radius, 2)));
        scan.close();
    }
}
