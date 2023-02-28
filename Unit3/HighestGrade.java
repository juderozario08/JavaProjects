package Unit3;

import java.util.Scanner;

public class HighestGrade {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        // Ask the user for 5 inputs
        float[] marks = new float[5];

        for (int i = 0; i < 5; i++){

            // Store all 5 user inputs in an array
            System.out.print("Enter a grade (between 0 and 100): ");
            marks[i] = input.nextFloat();
        }

        // Print the max number from all the user inputs
        System.out.printf("The max number is %.2f.\n", ArrayNum.findMax(marks));

        input.close();
    }
}

class ArrayNum{
    public static float findMax(float[] numbers){
        float result = 0;

        for (int i = 0; i < 5; i++){
            // Go through the array and check if the current number is bigger than the result
            if (result < numbers[i]) // If true, set result to the bigger number
                result = numbers[i];
        }
        return result;
    }
}
