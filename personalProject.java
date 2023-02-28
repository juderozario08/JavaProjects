import java.util.Scanner;
import MyLibs.Search;

public class personalProject {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many students are in your class? ");
        // Get the number of students in class
        int studentAmount = input.nextInt();
        input.nextLine();
        System.out.println();
        // Initialize the classList with the number of students
        String classList[] = new String[studentAmount];
        // Student amount is greater than 0, carry on with the program.
        // Else print error message and shut down the program.
        if (studentAmount > 0) {
            // Get all the names of the students
            for (int index = 0; index < studentAmount; index++) {
                System.out.println("What is the name of student " + (index + 1));
                classList[index] = input.nextLine();
                System.out.println();
            } // for
              // Sort the names in ascending order
            sorting(classList);
            System.out.println("Order: ");
            for (int i = 0; i < studentAmount; i++)
                System.out.println(classList[i]);
            // for
        } // if
        else {
            System.out.println("Please try again");
            System.exit(0);
        } // else
        System.out.println();
        System.out.println("What student are you looking for?");
        // Get the name
        String name = input.nextLine();
        int index = Search.binarySearchStringIndex(classList, 0, studentAmount - 1, name);
        // Print the name if found
        if (index == -1)
            System.out.println("Name not found in the list.");
        else
            System.out.println("Found in position " + index + " of the list.");
        System.out.println();
    }// main

    /**
     * Using bubble sort in order to organize the array in ascending order.
     * 
     * @param arr Array we want to sort
     */
    public static void sorting(String[] arr) {
        int n = arr.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } 
            } 
        } 
    }
}