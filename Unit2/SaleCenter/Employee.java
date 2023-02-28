package Unit2.SaleCenter;

public abstract class Employee 
{
    protected String firstName;
    protected String lastName;
    Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    abstract float calculatePay();
}
