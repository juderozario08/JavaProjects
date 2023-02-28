package practice.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readPopulation{
    public static void main(String[] args) throws FileNotFoundException{
        
        ArrayList<String[]> population = new ArrayList<String[]>();

        File file = new File("fileReader/text.txt");
        
        // Read through the file
        Scanner input = new Scanner(file);
        
        // As long as the text file has a next line, loop continues
        while(input.hasNextLine()){

            // Store the line in temp
            String temp = input.nextLine();

            // Turn that line into an array and store it in the list
            // [CountryName, Population]
            population.add(temp.split(" "));
        }
        Population.printMaxPopulation(population);
        Population.printMinPopulation(population); 
        input.close();
    }
}
class Population{

    public static void printMaxPopulation(ArrayList<String[]> population){
        long result = 0;
        String country = "";
        for (String[] i : population){
            if (result < Long.parseLong(i[1])){
                result = Long.parseLong(i[1]);
                country = i[0];
            }
        }
        System.out.println(country + " - " + result);   
    }
    public static void printMinPopulation(ArrayList<String[]> population){
        long result = Long.MAX_VALUE;
        String country = "";
        for (String[] i : population){
            if (result > Long.parseLong(i[1])){
                result = Long.parseLong(i[1]);
                country = i[0];
            }
        }
        System.out.println(country + " - " + result);   
    }
}