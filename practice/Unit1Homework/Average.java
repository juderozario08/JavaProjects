package practice.Unit1Homework;

import java.util.Scanner;

class Average 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float[] number = new float[10];
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter Marks for Course "+(i+1)+": ");
            number[i] = sc.nextFloat();
        }
        System.out.println(getAverage(number));
        sc.close();
    }
    public static float getAverage(float[] number)
    {
        float sum = 0;
        for (int i = 0; i < 4; i++)
            sum += number[i];
        return sum/4;
    }
}
