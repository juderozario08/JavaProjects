class test{
    public static void main(String[] args){
        for (int i = 1; i <= 25; i++)
            System.out.println(catalanNumbers((double)i));
    }
    public static double catalanNumbers(double num){
        return fct(2*num)/(fct(num+1)*fct(num));

    }
    public static double fct(double num){
        if (num <= 2)
            return num;
        return num*fct(num-1.0);
    }
}