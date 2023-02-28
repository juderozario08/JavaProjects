package Unit2.StudentReportCard;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt user for Student Information
        System.out.println("(1) Male ");
        System.out.println("(2) Female");
        System.out.print("Enter Gender: ");
        int choice = input.nextInt();
        input.nextLine(); // Clean the scanner
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        int age = getValidAge(input);
        System.out.print("Enter Roll Number: ");
        int RollNumber = input.nextInt();
        System.out.print("Enter the number of scores you have: ");
        int numOfScores = input.nextInt();
        float[] score = new float[20];

        // Store all the scores from the user inputs in an array
        for (int i = 0; i < numOfScores; i++){
            System.out.print("Enter Score "+(i+1)+": ");
            score[i] = input.nextFloat();
        }

        StudentClass student = new StudentClass(name, age, RollNumber, score);
        
        // Print user's name and age
        System.out.println("\nStudent Report Card: \n");
        System.out.println(student.name+" is "+student.age+" years old.");
        // Print Roll Number and Average score according to the gender
        if (choice == 1){
            System.out.println("His roll number is "+student.RollNumber+".");
            System.out.printf("\nHis average is %.2f.\n",student.average(numOfScores));
        }
        else {
            System.out.println("Her roll number is "+student.RollNumber+".");
            System.out.printf("\nHer average is %.2f.\n",student.average(numOfScores));
        }
        input.close(); // Close the scanner
    }
    private static int getValidAge(Scanner input){
        // Get a positive integer
        int number;
        do {
            System.out.print("Enter Age: ");
            number = input.nextInt();
        }while (number < 0);
        return number;
    }
}