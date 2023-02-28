import java.util.*;

class factoringPolynomials{
    // List of all factors of the final coefficient
    static ArrayList<Double> Factors = new ArrayList<Double>();
    // List of all Coefficients
    static ArrayList<Double> Coeffs = new ArrayList<Double>();
    // List of the remainders of each factors
    static ArrayList<Double> Results = new ArrayList<Double>();
    // List of all possible factors that can output 0
    static ArrayList<Double> Zeros = new ArrayList<Double>();
    // List of all Coefficients after synthetic division
    static ArrayList<Double> eqnResults = new ArrayList<Double>();

    public static void main(String[] args){
        // Initialize a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is the degree of the equation? ");

        // Take user input for degree of the equation
        int degree = input.nextInt();
        // Get all the coefficients and store them in a list
        for (int i = 0; i <= degree; i++){
            System.out.printf("Enter Coefficient %d: ", i+1);
            Coeffs.add(input.nextDouble());
        }
        input.close();
        switch(degree){
            case 2: quadraticFormula();
        }
        // Check if the final coefficient is a decimal or not
        double roundUp = Math.ceil(Coeffs.get(degree));
        double roundDown = Math.floor(Coeffs.get(degree));
        if (Coeffs.get(degree)<roundUp && Coeffs.get(degree)>roundDown)
            System.exit(0);
        // Find the factors using the factor theorem
        if (Coeffs.get(degree)<0)
            factors(Coeffs.get(degree)*-1);
        else
            factors(Coeffs.get(degree));
        // Find the result of each factor and store them in the list
        for(int i = 0; i < Factors.size(); i++){
            double result = 0;
            int power = 1;
            for (int j = degree-1; j >= 0; j--){
                double number = Math.pow(Factors.get(i), power);
                result += Coeffs.get(j)*number;
                power++;
            }
            result += Coeffs.get(degree);
            Results.add(result);
        }
        // Match which factors output zero and single them out in the Zeros List
        for (int i = 0; i < Results.size(); i++){
            if (Results.get(i)==0)
                Zeros.add(Factors.get(i));
        }
        // Exit if there are no zeros
        if (Zeros.size()==0){
            System.out.println("No factors output 0");
            System.exit(2);
        }
        // Else show all Zeros
        System.out.println("The factors that output 0 are: "+Zeros);

        // Run Synthetic Divison
        for(int i = 0; i < Zeros.size(); i++)
            syntheticDivision(Zeros.get(i));
    }
    private static void factors(double number){
        for (double i = 1; i <= number; i++){
            if (number % i == 0){
                Factors.add(i);
                Factors.add(i*-1);
            }
        }
    }
    private static void syntheticDivision(double number){
        /*
            First Coeff = Result
            (Result * Factor) + 2nd Coeff = Result
            (Result * Factor) + 3rd Coeff = Result
            (Result * Factor) + 4th Coeff = Result = 0
        */
        eqnResults.add(Coeffs.get(0));
        double result = Coeffs.get(0);
        for (int i = 1; i < Coeffs.size()-1; i++){
            result *= number;
            result += Coeffs.get(i);
            eqnResults.add(result);
        }
        double tempNum = number*-1;
        if(tempNum<0)
            System.out.println("Factor is: x"+tempNum);
        else
            System.out.println("Factor is: x+"+tempNum);
        System.out.print("Quotient is: ");
        int power = eqnResults.size()-1;
        for(int j = 0; j < eqnResults.size()-1; j++){
            if(eqnResults.get(j)!=0)
                System.out.print(eqnResults.get(j)+"x^"+power+"  ");
            power--;
        }
        System.out.print(eqnResults.get(eqnResults.size()-1));
        System.out.println();
        Factors.clear();
        Coeffs.clear();
        Results.clear();
        for(int i = 0; i < eqnResults.size(); i++)
            Coeffs.add(eqnResults.get(i));
        eqnResults.clear();
    }
    public static void quadraticFormula(){
        double a = Coeffs.get(0);
        double b = Coeffs.get(1);
        double c = Coeffs.get(2);
        double insideRoot = Math.pow(b,2) - (4*a*c);
        double result;
        double result2;
        if(insideRoot < 0)
            System.exit(1);
        else{
            result = (-b+Math.sqrt(insideRoot))/(2*a);
            result2 = (-b-Math.sqrt(insideRoot))/(2*a);
            System.out.println("x = "+result);
            System.out.println("x = "+result2);
            if(result < 0)
                System.out.println("x + "+-1*result);
            else
                System.out.println("x - "+result);
            if(result2 < 0)
                System.out.println("x + "+-1*result2);
            else
                System.out.println("x - "+result2);
        }
    }
}