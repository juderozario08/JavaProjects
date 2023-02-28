import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String temp = "";
        while (!temp.toUpperCase().equals("STOP")){
            System.out.print("Enter a first name <stop to quit>: ");
            temp = input.nextLine();
            if (!temp.toUpperCase().equals("STOP"))
                names.add(temp);
        }
        System.out.println("The longest name was: "+findLargestName(names));
        input.close();
    }
    private static String findLargestName(ArrayList<String> names){
        int nameLength = 0;
        String name = "";
        for (String i : names){
            if (i.trim().length()>nameLength){
                nameLength = i.trim().length();
                name = i.trim();
            }
        }
        return name.toUpperCase();
    }
}
