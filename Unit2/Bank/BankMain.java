package Unit2.Bank;

import java.util.Scanner;

public class BankMain 
{
    public static void main(String[] args)
    {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter First Name: "); 
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: "); 
        String lastName = input.nextLine(); 
        System.out.print("Enter Street: "); 
        String street = input.nextLine();
        System.out.print("Enter City: "); 
        String city = input.nextLine();
        System.out.print("Enter State/Province: "); 
        String state = input.nextLine(); 
        System.out.print("Enter ZIP/Postal Code: "); 
        String zip = input.nextLine();
        
        // Create an account with all the user inputs
        Account account = new Account(firstName, lastName, street, city, state, zip);
        
        System.out.print("Enter the amount of money you have in your account: "); 
        double balance = input.nextDouble();
        account.balance = balance;

        // Print the current customer information
        System.out.println("\n"+account.toString()+"\n");
        int choice = 0;
        int extraChoice = 0;
        while(choice != 5 && (extraChoice != 4 || extraChoice != 1)){
            // Prompt user for account activity
            choice = getChoice(input);
            // Depending on the users activity carry out that specific task
            carryOutAccountActivity(choice, input, account);
            extraChoice = viewInfo(input);
            if (extraChoice == 1){
                // View Information and Exit
                System.out.println("\n"+account.toString()+"\n");
                System.exit(0);
            }
            else if (extraChoice == 2) // View Information and ask for more changes
                System.out.println("\n"+account.toString()+"\n");
            else if (extraChoice == 4) // Quit the program
                System.exit(0);
        }
        input.close();
    }
    private static void carryOutAccountActivity(int choice, Scanner input, Account account)
    {
        switch (choice)
        {
            case 1: getDeposit(input, account); // Prompt the user for a deposit amount 
            break;
            case 2: getWithdrawal(input, account); // Prompt the user for a deposit amount   
            break;
            case 3: input.nextLine();
                    getNewStreetInfo(input, account);
            break;
            case 4: input.nextLine();
                    getNewNameInfo(input, account);
            break;
            case 5: System.exit(0);
            break;
        }
    }
    private static void getDeposit(Scanner input, Account account)
    {
        float deposit;
        do
        {
            System.out.print("Enter Deposit Amount: ");
            deposit = input.nextFloat();
        }while(deposit < 0f);
        account.deposit(deposit);
        account.getBalance(); // Print final balance after the account activity
        System.out.println();
    }
    private static void getWithdrawal(Scanner input, Account account)
    {
        float withdrawal;
        do
        {
            System.out.print("Enter Withdrawal Amount: ");
            withdrawal = input.nextFloat();
        }while(withdrawal < 0f);
        account.withdrawal(withdrawal);
        account.getBalance(); // Print final balance after the account activity
        System.out.println();
    }
    private static void getNewStreetInfo(Scanner input, Account account)
    {
        System.out.print("Enter new Street: ");
        String street = input.nextLine();
        System.out.print("Enter new City: ");
        String city = input.nextLine();
        System.out.print("Enter new State: ");
        String state = input.nextLine();
        System.out.print("Enter new Zip/new Postal Code: ");
        String zip = input.nextLine();
        System.out.println("\nThe new address is:");
        System.out.println(account.changeAddress(street, city, state, zip)+ "\n");
    }
    private static void getNewNameInfo(Scanner input, Account account)
    {
        System.out.print("Enter new First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter new Last Name: ");
        String lastName = input.nextLine();
        System.out.println("\nThe new name is: ");
        System.out.println(account.changeFullName(firstName, lastName)+"\n");
    }
    private static int getChoice(Scanner input)
    {
        int choice;
        do
        {
            System.out.println("Would you like to: ");
            System.out.println("(1) Deposit Money");
            System.out.println("(2) Withdraw Money");
            System.out.println("(3) Change Address");
            System.out.println("(4) Change Name");
            System.out.println("(5) Quit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
        }while(choice < 1 || choice > 5);
        return choice;
    }
    private static int viewInfo(Scanner input)
    {
        int viewInfo;
        do
        {
            System.out.println("Enter (1) to View Updated Information and Exit");
            System.out.println("Enter (2) to View Updated Information and Change More Information");
            System.out.println("Enter (3) to Change More Information");
            System.out.println("Enter (4) to Quit");
            System.out.print("Enter Choice: ");
            viewInfo = input.nextInt();
        }while(viewInfo < 0 || viewInfo > 4);
        return viewInfo;
    }
}