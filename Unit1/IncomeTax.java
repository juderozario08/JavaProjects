package Unit1;
import java.util.Scanner;

public class IncomeTax 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Create scanner
        int income = getPositiveInt(scan);
        // Create 2 temporary variables to carry out calculations without changing the user input
        int temp = income; 
        int temp2 = income;
        // Creating arrays for the Given values and Percentages from the Question and one array to get subtracted values that can be multiplied
        float[] federalPercentages = {(float)15, (float)20.5, (float)26, (float)29, (float)33};
        int[] givenFederalValues = {48535, 97069, 150473, 214368, income};
        int[] subtractedFederalValues = new int[10];
        // This loop inputs the subtract values in order of the percentages that will be used
        for (int i = 0; i < 5; i++)
        {
            if (temp2 >= givenFederalValues[i])
                subtractedFederalValues[i] = givenFederalValues[i]; // If value is bigger than given number, put the given number in the array
            else if (temp2 > 0 && temp2 < givenFederalValues[i])
                subtractedFederalValues[i] = temp2; // If the value is less than the given number, then input the value itself in the array
            else if (temp2 < 0)
                subtractedFederalValues[i] = 0; // Input 0 if the value is already less than 0
            // Subtract the value to get all the accurate amounts in the array
            temp2 -= givenFederalValues[i]; 
        }
        // Call the federal tax function and store the value
        float federalTax = getFederalTax(subtractedFederalValues, federalPercentages);
        System.out.print("In which province do you live? (1 for BC, 2 for Alberta and 3 for Ontario): ");
        // Prompt the user to input their province as an int
        int choice = scan.nextInt();
        checkFederalIncomeRangeAndTax(income);
        if (choice == 1) // If the user chooses BC
        {
            // Initialize arrays for Given Values, Percentages and Subtracted Values
            float[] BCPercentages = {(float)5.06, (float)7.7, (float)10.5, (float)12.29, (float)14.7, (float)16.8};
            int[] givenBCValues = {40707, 81416, 93476, 113503, 153900, income};
            int[] subtractedValues = new int[10];
            for (int i = 0; i < 6; i++)
            {
                if (temp >= givenBCValues[i])
                    subtractedValues[i] = givenBCValues[i];
                else if (temp > 0 && temp < givenBCValues[i])
                    subtractedValues[i] = temp;
                else if (temp < 0)
                    subtractedValues[i] = 0;
                temp -= givenBCValues[i];
            }
            // Call the BC Provincial Tax function and store the value
            float BCProvincialTax = getBCProvincialTax(subtractedValues, BCPercentages);
            System.out.printf("Your federal tax is $%,f.\n",federalTax);
            checkBCIncomeRangeAndTax(income);
            System.out.printf("Your BC provincial tax is $%,f.\n",BCProvincialTax);
            // Print the total tax
            System.out.printf("Your total tax for the year 2020 is $%,f.\n",(federalTax+BCProvincialTax));
            System.out.printf("Your net income for the year 2020 is $%,f.\n",(income - (federalTax+BCProvincialTax)));
        }
        else if (choice == 2) // If the user chooses Alberta
        {
            // Initialize arrays for Given Values, Percentages and Subtracted Values
            float[] AlbertaPercentages = {(float)10, (float)12, (float)13, (float)14, (float)15};
            int[] givenAlbertaValues = {131200, 157464, 209252, 314928, income};
            int[] subtractedValues = new int[10];
            for (int i = 0; i < 5; i++)
            {
                if (temp >= givenAlbertaValues[i])
                    subtractedValues[i] = givenAlbertaValues[i];
                else if (temp > 0 && temp < givenAlbertaValues[i])
                    subtractedValues[i] = temp;
                else if (temp < 0)
                    subtractedValues[i] = 0;
                temp -= givenAlbertaValues[i];
            }
            // Call the Alberta Provincial Tax function and store the value
            float AlbertaProvincialTax = getAlbertaProvincialTax(subtractedValues, AlbertaPercentages);
            System.out.printf("Your federal tax is $%,f.\n",federalTax);
            checkAlbertaIncomeRangeAndTax(income);
            System.out.printf("Your Alberta provincial tax is $%,f.\n",AlbertaProvincialTax);
            // Print the total tax
            System.out.printf("Your total tax for the year 2020 is $%,f.\n",(federalTax+AlbertaProvincialTax));
            System.out.printf("Your net income for the year 2020 is $%,f.\n",(income - (federalTax+AlbertaProvincialTax)));
        }
        else if (choice == 3) // If the user chooses Ontario
        {
            // Initialize arrays for Given Values, Percentages and Subtracted Values
            float[] OntarioPercentages = {(float)5.05, (float)9.15, (float)11.16, (float)12.16, (float)13.16};
            int[] givenOntarioValues = {43906, 87813, 150000, 220000, income};
            int[] subtractedValues = new int[10];
            for (int i = 0; i < 5; i++)
            {
                if (temp >= givenOntarioValues[i])
                    subtractedValues[i] = givenOntarioValues[i];
                else if (temp > 0 && temp < givenOntarioValues[i])
                    subtractedValues[i] = temp;
                else if (temp < 0)
                    subtractedValues[i] = 0;
                temp -= givenOntarioValues[i];
            }
            // Call the Ontario Provincial Tax function and store the value
            float OntarioProvincialTax = getOntarioProvincialTax(subtractedValues, OntarioPercentages);
            System.out.printf("Your federal tax is $%,f.\n",federalTax);
            checkOntarioIncomeRangeAndTax(income);
            System.out.printf("Your Ontario provincial tax is $%,f.\n",OntarioProvincialTax);
            // Print the total tax
            System.out.printf("Your total tax for the year 2020 is $%,f.\n",(federalTax+OntarioProvincialTax));
            System.out.printf("Your net income for the year 2020 is $%,f.\n",(income - (federalTax+OntarioProvincialTax)));
        }
        scan.close();
    }
    public static int getPositiveInt(Scanner scan)
    {
        // Get a positive integer that is atleast 1000
        int number;
        do
        {
            System.out.println("What is your taxable income? ");
            number = scan.nextInt();
        } 
        while (number < 1000);
        return number;
    }
    public static float getFederalTax(int[] subtractedFederalValues,float[] federalPercentages)
    {
        float federalTax = 0;
        for (int i = 0; i < 5; i++)
            // Multiple the percentages with the subtracted values and add the amount to get the final tax
            federalTax += subtractedFederalValues[i]*federalPercentages[i];
        return federalTax/100;
    }
    public static float getBCProvincialTax(int[] subtractedValues, float[] BCPercentages)
    {
        float provincialTax = 0;
        for(int i = 0; i < 6; i++)
            // Multiple the percentages with the subtracted values and add the amount to get the final tax
            provincialTax += subtractedValues[i]*BCPercentages[i];
        return provincialTax/100;
    }
    public static float getAlbertaProvincialTax(int[] subtractedValues, float[] AlbertaPercentages)
    {
        float provincialTax = 0;
        for(int i = 0; i < 5; i++)  
            // Multiple the percentages with the subtracted values and add the amount to get the final tax
            provincialTax += subtractedValues[i]*AlbertaPercentages[i];
        return provincialTax/100;
    }
    public static float getOntarioProvincialTax(int[] subtractedValues, float[] OntarioPercentages)
    {
        float provincialTax = 0;
        for(int i = 0; i < 5; i++)
            // Multiple the percentages with the subtracted values and add the amount to get the final tax
            provincialTax += subtractedValues[i]*OntarioPercentages[i];
        return provincialTax/100;
    }
    public static void checkFederalIncomeRangeAndTax(int income) // Prints the proper tax range and income range
    {
        if (income > 0 && income <= 48535)
            System.out.println("\nYour federal income falls under tax bracket 48535.\nYour federal tax rate is 15%.");
        else if (income > 48535 && income <= 97069)
            System.out.println("\nYour federal income falls under tax bracket 48535-97069.\nYour federal tax rate is 20.5%.");
        else if (income > 97069 && income <= 150473)
            System.out.println("\nYour federal income falls under tax bracket 97069-150473.\nYour federal tax rate is 26%.");
        else if (income > 150473 && income <= 214368)
            System.out.println("\nYour federal income falls under tax bracket 97069-214368.\nYour federal tax rate is 26%.");
        else if (income > 214368)
            System.out.println("\nYour federal income falls above tax bracket 214368.\nYour federal tax rate is 26%.");
    }
    public static void checkBCIncomeRangeAndTax(int income) // Prints the proper tax range
    {
        if (income > 0 && income <= 40707)
            System.out.println("Your BC tax rate is 5.06%.");
        else if (income > 40707 && income <= 81416)
            System.out.println("Your BC tax rate is 7.7%.");
        else if (income > 81416 && income <= 93476)
            System.out.println("Your BC tax rate is 10.5%.");
        else if (income > 93476 && income <= 113503)
            System.out.println("Your BC tax rate is 12.29%.");
        else if (income > 113503 && income <= 153900)
            System.out.println("Your BC tax rate is 14.7%.");
        else if (income > 153900)
            System.out.println("Your BC tax rate is 16.8%.");
    }
    public static void checkAlbertaIncomeRangeAndTax(int income) // Prints the proper tax range
    {
        if (income > 0 && income <= 131200)
            System.out.println("Your Alberta tax rate is 10%.");
        else if (income > 131200 && income <= 157464)
            System.out.println("Your Alberta tax rate is 12%.");
        else if (income > 157464 && income <= 209252)
            System.out.println("Your Alberta tax rate is 13%.");
        else if (income > 209252 && income <= 314928)
            System.out.println("Your Alberta tax rate is 14%.");
        else if (income > 314928)
            System.out.println("Your Alberta tax rate is 15%.");
    }
    public static void checkOntarioIncomeRangeAndTax(int income) // Prints the proper tax range
    {
        if (income > 0 && income <= 43906)
            System.out.println("Your Ontario tax rate is 5.05%.");
        else if (income > 43906 && income <= 87813)
            System.out.println("Your Ontario tax rate is 9.15%.");
        else if (income > 87813 && income <= 150000)
            System.out.println("Your Ontario tax rate is 11.16%.");
        else if (income > 150000 && income <= 220000)
            System.out.println("Your Ontario tax rate is 12.16%.");
        else if (income > 220000)
            System.out.println("Your Ontario tax rate is 13.16%.");
    }
}