package Unit1;

import java.util.Scanner;

public class TrigFunctions 
{
    public static void main(String[] args)
    {
        // Call the three trigfunctions in main
        Scanner input = new Scanner(System.in);
        float degree = getPositiveFloat(input);
        TanFunction(degree); // Get Tan Value
        SinFunction(degree); // Get Sin Value
        CosFunction(degree); // Get Cos Value
    }
    public static float getPositiveFloat(Scanner input)
    {
        float number;
        do 
        {
            System.out.print("Enter a degree: "); 
            number = input.nextFloat(); // Ask the user for input
        }while(number < 0 || number > 360);
        return number;
    }
    public static void TanFunction(float degrees)
    {
        double radians = Math.toRadians(degrees); // Convert the degree to Radians for the trig functions
        double tanValue = Math.tan(radians); // Convert to the TrigValue
        System.out.println("Tan value is "+tanValue); // Print the final TanValue
    }
    public static void SinFunction(float degrees)
    {
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        System.out.println("Sin value is " +sinValue);
    }
    public static void CosFunction(float degrees)
    {
        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);
        System.out.println("Cos value is "+cosValue);
    }
}
