package Unit2.Vehicle;

import java.util.*;

public class VehicleMain 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for what class they want to create
        System.out.println("Enter vehicle type: ");
        System.out.println("(1) Car");
        System.out.println("(2) Truck");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1: askAndPrintCarInfo(input);
            break;
            case 2: askAndPrintTruckInfo(input);
            break;
            default: defaultCase();
        }
        input.close();
    }
    private static void askAndPrintCarInfo(Scanner input){

        // Prompt user for Car Information
        input.nextLine();
        System.out.print("Enter car brand: ");
        String brand = input.nextLine();
        System.out.print("Enter the number of Cylinders: ");
        int noOfCylinders = input.nextInt();
        input.nextLine();
        System.out.print("Enter a Color: ");
        String color = input.nextLine();
        System.out.print("Enter the number of seats: ");
        int noOfSeats = input.nextInt();
        
        // Create a Car class and pass all the inputs to print the final information
        VehicleClass vehicle = new Car(color, noOfCylinders, noOfSeats, brand); 
        System.out.println("\n"+vehicle.toString());
    }
    private static void askAndPrintTruckInfo(Scanner input){

        // Prompt user for Truck Information
        input.nextLine();
        System.out.print("Enter truck brand: ");
        String brand = input.nextLine();
        System.out.print("Enter the number of Cylinders: ");
        int noOfCylinders = input.nextInt();
        input.nextLine();
        System.out.print("Enter a Color: ");
        String color = input.nextLine();
        System.out.print("Enter the Towing Capacity in kg: ");
        int towingCapacity = input.nextInt();

        // Create a Truck class and pass all the inputs to print the final information
        VehicleClass vehicle = new Truck(color, noOfCylinders, towingCapacity, brand); 
        System.out.println("\n"+vehicle.toString());
    }
    private static void defaultCase(){

        // This is a default case if the user does not put in the normal inputs
        VehicleClass vehicle = new VehicleClass("Black", 6 ,"None");
        System.out.println("This is default:\n"+vehicle.toString());
    }
}
