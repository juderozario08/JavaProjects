import java.util.*;

public class secretInstructions {
    static ArrayList<String> answers = new ArrayList<String>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number = "";
        String previous = "";
        while(!number.equals("99999")){
            number = input.nextLine();
            int temp = Integer.parseInt(number);
            String steps = String.valueOf((temp/100)%10)+String.valueOf((temp/10)%10)+String.valueOf(temp%10);
            if (temp != 99999)
                if(temp/10000 == 0 && temp/1000 == 0)
                    answers.add(previous + " " + steps);
                else if (((temp/1000)+(temp/10000))%2==0){
                    answers.add("right " + steps); 
                    previous = "right";
                }
                else{
                    answers.add("left " + steps);
                    previous = "left";
                } 
        }
        for(String i : answers)
            System.out.println(i);
        input.close();
    }
}
