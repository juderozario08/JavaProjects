package Unit3;

import java.util.ArrayList;
import java.util.Random;

class Numbers {

    public static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Random random;
    public static void getEvensAndOdds(){
        for (int i = 0; i < 25; i++){
            random = new Random();
            int temp = random.nextInt(100);
            numbers.add(temp);
        }
        printEvens();
        printOdds();
    }
    public static void printEvens(){
        int counter = 0;
        System.out.print("\nEvens: ");
        for (int i = 0; i < numbers.size();){
            int temp = numbers.get(i);
            if (temp % 2 == 0){
                System.out.print(temp+" ");
                numbers.remove(i);
                counter++;
            }
            else
                i++;
        }
        System.out.println("\nNumber of Even Numbers: "+counter);
    }
    public static void printOdds(){
        int counter = 0;
        System.out.print("\nOdds: ");
        for (int i = 0; i < numbers.size();){
            System.out.print(numbers.get(i)+" ");
            numbers.remove(i);
            counter++;            
        }
        System.out.println("\nNumber of Odd Numbers: "+counter+"\n");
    }   
}

public class EvensAndOdds{
    public static void main(String[] args){
        // Get random evens and odds
        Numbers.getEvensAndOdds();
    }
}