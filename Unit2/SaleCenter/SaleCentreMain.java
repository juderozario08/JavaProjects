package Unit2.SaleCenter;

import java.util.Scanner;

public class SaleCentreMain 
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Welcome to the Sale Centre");
        System.out.println("--------------------------");
        
        while(true){

            System.out.println("(1) for Manager");
            System.out.println("(2) for Associate");
            System.out.print("Enter Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            // Carries out all the processes for creating and finding the payment of the employee
            createAnEmployeeAndPrintInformation(choice, input);

            // Ask the user if they want to continue the progoram
            System.out.println("Do you want to continue? y/n");
            input.nextLine();
            System.out.print("Enter Choice: ");
            String cont = input.nextLine();

            // If no, then exit the program
            if (cont.toLowerCase().equals("n"))
                System.exit(0);
        } 
    }
    private static void createAnEmployeeAndPrintInformation(int choice, Scanner input){
        Employee employee;
        // Based on the choice of the user, create an employee
        switch(choice)
        {
            case 1: employee = new Manager(getFirstName(input), getLastName(input), getYearlySalary(input)); toStringManagerInformation(input, employee);
            break;
            case 2: employee = new Associate(getFirstName(input), getLastName(input), getHourlyPayRate(input), getHoursWorked(input)); toStringAssociateInformation(input, employee);
            break;
            default: System.out.println("Invalid Input (Choice needs to between 1 and 2)");
        }
    }
    private static String getFirstName(Scanner input){
        // Prompt user to put the first name
        System.out.print("Enter first name: ");
        return capitalizeFirstLetter(input.nextLine());
    }
    private static String getLastName(Scanner input){
        // Prompt user to put the last name
        System.out.print("Enter last name: ");
        return capitalizeFirstLetter(input.nextLine());
    }
    private static float getHourlyPayRate(Scanner input){
        // Prompt user for the hourly rate
        float number;
        do{
            System.out.print("Enter the Hourly Pay Rate: ");
            number = input.nextFloat();
        }while (number < 0);
        return number;
    }
    private static float getYearlySalary(Scanner input){
        // Prompt user for the yearly salary
        float number;
        do{
            System.out.print("Enter the Yearly Pay: ");
            number = input.nextFloat();
        }while (number < 0);
        return number;
    }
    private static float getHoursWorked(Scanner input){
        // Prompt user for amount of Hours the Associate worked for
        System.out.print("Enter the number of hours they worked today: ");
        return input.nextFloat();
    }
    private static void toStringManagerInformation(Scanner input, Employee employee){
        // Print the final Manager Information
        System.out.println("\n----------------------------------------");
        System.out.printf("%s$%,.2f.\n", employee.toString(), employee.calculatePay());
        System.out.println("----------------------------------------\n");
    }
    private static void toStringAssociateInformation(Scanner input, Employee employee){
        // Print the final Associate Information
        System.out.println("\n----------------------------------------");
        System.out.printf("%s$%,.2f.\n", employee.toString(), employee.calculatePay());
        System.out.println("----------------------------------------\n");
    }
    private static String capitalizeFirstLetter(String word){
        // Capitalize the first character of every word
        String result = "";
        String[] words = word.split(" ");
        for (String i : words)
            result += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        return result.trim();
    }
}