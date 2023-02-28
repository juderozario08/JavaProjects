package practice.Unit2Homework;


import java.util.Scanner;

class Rectangle
{
    double length;
    double width;

    Rectangle()
    {
        this.length = 1;    
        this.width = 2;
    }
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    double area()
    {
        return length*width;
    }
    double perimeter()
    {
        return 2*(length+width);
    }
}

public class RectangleBox
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Rectangle rect2 = new Rectangle();
        System.out.println("The area is: "+rect2.area());
        System.out.println("The perimeter is: "+rect2.perimeter());
        double length = 1;
        double width = 1;
        while (length == width)
        {
            System.out.print("Enter Length: ");
            length = input.nextDouble();
            System.out.print("Enter Width: ");
            width = input.nextDouble();
        }
        Rectangle rect = new Rectangle(length, width);
        System.out.println("The area is: "+rect.area());
        System.out.println("The perimeter is: "+rect.perimeter());
        input.close();
    }
}