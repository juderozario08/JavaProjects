package Unit1;

public class PythagoreanTriple 
{
    public static void main(String[] args)
    {
        // Initialize values to 1
        int a = 1; 
        int b = 1;
        int c;
        for (int i = 1; i < 100; i++)
        {
            for (int j = 1; j < 100; j++)
            {
                c = (int)(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                if (PythagoreanTripleFunction(a, b, c))
                // If Pythagorean Triple Function returns True, I print the values
                    System.out.println(a+"^2 + "+b+"^2 = "+c+"^2");  
                b++;
            }
            a++;
            b = 1; // Initialize b to 1 to continue to formula while increasing a values accordingly
        }
    }
    public static boolean PythagoreanTripleFunction(int a, int b, int c)
    {
        if ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2)) // If condition meets, return true
            return true;
        return false;
    }
}
