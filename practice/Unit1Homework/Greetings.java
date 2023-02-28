package practice.Unit1Homework;


import java.util.Scanner;

public class Greetings 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        int birth;
        do
        {
            System.out.print("Enter birth year: ");
            birth = scan.nextInt();
        }
        while (birth > 2021 || birth < 1900);
        System.out.println("Hi, "+name+". You were born in "+birth+" so your age must be "+(2021-birth)+".");
        System.out.println("You will be 25 years on " + (birth+25));
        System.out.println("You will be 50 years on " + (birth+50));
        System.out.println("You will be 75 years on " + (birth+75));
        scan.close();
    }
}
