// Solution with formula
import java.util.*;

public class arrangingBooks{
    static int numOfLetters;
    static char[] letters;
    static int[] values;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String books = input.nextLine().toUpperCase();
        numOfLetters = books.length();
        input.close();
        letters = books.toCharArray();
        values = new int[numOfLetters];
        int largeBooks = 0;
        int mediumBooks = 0;
        for(int i = 0; i < numOfLetters; i++){
            if (letters[i] == 'L'){
                values[i] = 3;
                largeBooks++;
            }
            else if (letters[i] == 'M'){
                values[i] = 2;
                mediumBooks++;
            }
            else if (letters[i] == 'S'){
                values[i] = 1;
            }
        }
        int nonLinL = 0;
        int nonSinS = 0;
        int LinS = 0;
        int SinL = 0;
        for(int i = 0; i < numOfLetters; i++){
            if(i < largeBooks && values[i] != 3){
                nonLinL++;
                if(values[i] == 1)
                    SinL++;
            }
            else if((i >= largeBooks+mediumBooks && i < numOfLetters)&& values[i] != 1){
                nonSinS++;
                if(values[i] == 3)
                    LinS++;
            }
        }
        System.out.println(nonLinL+nonSinS-Math.min(LinS, SinL));
    }
}