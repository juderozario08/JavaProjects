package Unit2.Bank;

public class Account
{
    String firstName;
    String lastName; 
    String street; 
    String city;
    String state;
    String zip;
    double balance;
    Customer customer; 

    Account(String firstName, String lastName, String street, String city, String state, String zip)
    {
        customer = new Customer(firstName, lastName, street, city, state, zip);
        this.firstName = customer.firstName; 
        this.lastName = customer.lastName; 
        this.street = customer.street; 
        this.city = customer.city;
        this.state = customer.state; 
        this.zip = customer.zip; 
    }
    public void getBalance()
    {
        System.out.printf("Your balace is $%,.2f\n", balance);
    }  
    public void deposit(double dep)
    {
        balance += dep;
        System.out.printf("You depositted $%,.2f\n", dep);
    }
    public void withdrawal(double  withdraw)
    {
        if (withdraw <= balance)
        {
            balance -= withdraw;
            System.out.printf("You withdrew $%,.2f\n", withdraw);
        }
        else
            System.out.println("Not enough money in account.");
    }
    public String changeAddress(String street, String city, String state, String zip)
    {
        return customer.changeStreet(street) + "\n" + customer.changeCity(city) + ", " + customer.changeState(state) + " " + customer.changeZip(zip);
    }
    public String changeFullName(String firstName, String lastName)
    {
        return customer.changeFirstName(firstName) + " " + customer.changeLastName(lastName);
    }
    public String toString()
    {
        return customer.toString() + "\nCurrent balance is $"+balance+".";
    }
}
