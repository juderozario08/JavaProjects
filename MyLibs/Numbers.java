package MyLibs;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    public static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static int index = 0;
    /**
     * Gets all the odd numbers from your inputs
     * @param input It takes the scanner as an input
     * @param reps The number of numbers you want to add
     * @return Print the odd and even numbers
     */
    public static void getEvensAndOdds(Scanner input, int reps){
        for (int i = 0; i < reps; i++){
            System.out.print("Enter a number: ");
            int temp = input.nextInt();
            numbers.add(temp);
        }
        printEvens();
        printOdds();
    }
    /**
     * Get all the even numbers from the array
     * @param array Array you want to check
     * @return Print the even numbers
     */
    public static void getEvens(int[] array){
        System.out.print("Evens: ");
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            if (temp % 2 == 0){
                System.out.print(temp+" ");
                numbers.remove(i);
            }
        }
    } 
    /**
     * Get all odd numbers from an array.
     * @param array The array you want to check
     * @return Print the odd numbers
     */
    public static void getOdds(int[] array){
        System.out.print("Odds: ");
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            if (temp % 2 != 0){
                System.out.print(temp+" ");
            }
        }
    }
    /**
     * Get all odd numbers from a list
     * @param array The list you want to check
     * @return Print the odd numbers
     */
    public static void getOdds(ArrayList<Integer> list){
        System.out.print("Evens: ");
        for (int i : list){
            int temp = i;
            if (temp % 2 == 0){
                System.out.print(temp+" ");
            }
        }
    }
    /**
     * Get all even numbers from the list
     * @param list The list you want to check
     * @return Print the even numbers
     */
    public static void getEvens(ArrayList<Integer> list){
        System.out.print("Evens: ");
        for (int i : list){
            int temp = i;
            if (temp % 2 == 0){
                System.out.print(temp+" ");
            }
        }
    } 
    /**
     * Print the closest number from the number I am looking for in the array.
     * @param number The key you want to look for
     * @param array The array you want to look through
     * @return prints the closest number
     */
    public static int closestNumber(int number, int[] array){
        return array[minIndex(getDifferences(array, number))];
    }  
    /**
     * Print the farthest number from the number I am looking for in the array.
     * @param number The key you want to look for
     * @param array The array you want to look through
     * @return prints the farthest number
     */
    public static int farthestNumber(int number, int[] array){
        return array[maxIndex(getDifferences(array, number))];
    }  
    /**
     * Get the index of the minimum value in the array
     * @param array The array you want to look through 
     * @return index of the minimum number
     */
    public static int minIndex(int[] array) {
        int size = array.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    /**
     * Get the index of the maximum value in the array
     * @param array The array you want to look through 
     * @return index of the maximum number
     */
    public static int maxIndex(int[] array) {
        int size = array.length;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++){
            if (min < array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    /**
     * Get the value of the minimum value in the array
     * @param array The array you want to look through 
     * @return the minimum number
     */
    public static int min(int[] array) {
        int size = array.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    /**
     * Get the value of the maximum value in the array
     * @param array The array you want to look through 
     * @return the maximum number
     */
    public static int max(int[] array) {
        int size = array.length;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++){
            if (min < array[i])
                min = array[i];
        }
        return min;
    }
    private static int[] getDifferences(int[] array, int number) {
        int size = array.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            if (array[i] > number)
                result[i] = array[i]-number;
            else
                result[i] = number-array[i];
        }
        return result;
    }
    private static void printEvens(){
        System.out.print("Evens: ");
        for (int i = 0; i < numbers.size();){
            int temp = numbers.get(i);
            if (temp % 2 == 0){
                System.out.print(temp+" ");
                numbers.remove(i);
            }
            else
                i++;
        }
    }
    private static void printOdds(){
        System.out.print("\nOdds: ");
        for (int i = 0; i < numbers.size();){
            System.out.print(numbers.get(i)+" ");
            numbers.remove(i);            
        }
    }
}
