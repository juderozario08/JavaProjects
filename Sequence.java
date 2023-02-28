import java.util.Random;

public class Sequence { 
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int result = 10;
        int i = 0;
        while (result != 0){
            int temp = random.nextInt(10);
            result = numbers[temp];
            System.out.print(result+" ");
            i++;
        }
        System.out.println("\nLength of the sequence is "+i);
    }
}
