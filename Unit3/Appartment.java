package Unit3;

import java.util.Scanner;

public class Appartment {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello!!!");
        System.out.println("-------------------------------------------");
        System.out.println("Estimate The Rent for the average Apartment");
        System.out.println("-------------------------------------------\n");       
        /** 
         * Initiate the array of prices
         * FloorNumber(1 bed, 2bed, Studio)
         */
        int[][] prices = {{900, 1200, 750},{1000, 1300, 850},{1100, 1400, 950}, {1300, 1500, 1050}};
        // Ask for the users input
        while(true){

            // Ask for the floor
            System.out.println("(1) for 1st Floor/(2) for 2nd Floor");
            System.out.println("(3) for 3rd Floor/(4) for 4th Floor");
            System.out.println("(0) to Quit\n");
            int floor = getProperFloor(input);

            // If floor is 0, exit the program
            if (floor == 0)
            {
                System.out.println("Bye!!!!!!");
                System.exit(0);
            }
            
            // Ask for the room number
            System.out.println("Enter (1) for One Bedroom Apartment");
            System.out.println("Enter (2) for Two Bedroom Apartment");
            System.out.println("Enter (3) for Studio Room\n");
            int room = getProperRoom(input);

            // Print the Rent
            System.out.println("-------------------");
            System.out.printf("The rent is $%,d.\n",findTheRent(prices, floor, room));
            System.out.println("-------------------");
        }
    }
    public static int findTheRent(int[][] prices, int floor, int room){
        int result = 0;
        // Use this nested for loop to loop through the index and then print the result
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (i == floor-1 && j == room-1){
                    result += prices[i][j];
                }
            }
        }
        return result;
    }
    private static int getProperFloor(Scanner input){
        // Prompt the user for input until the user puts a wanted input
        int number;
        do{
            System.out.print("Enter Choice: ");
            number = input.nextInt();
        }while(number < 0 || number > 4);
        return number;
    }
    private static int getProperRoom(Scanner input){
        int number;
        do{
            System.out.print("Enter Room: ");
            number = input.nextInt();
        }while(number < 1 || number > 3);
        return number;
    }
}
