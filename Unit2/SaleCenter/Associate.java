package Unit2.SaleCenter;

public class Associate extends Employee
{
    float hourlyPayRate;
    double hoursWorked;
    Associate(String firstName, String lastName, float hourlyPayRate, float hoursWorked) 
    {
        super(firstName, lastName);
        this.setHourlyPayRate(hourlyPayRate);
        this.setHoursWorked(hoursWorked);
    }

    @Override
    public float calculatePay()
    {
        float pay = (float) (hourlyPayRate * hoursWorked);
        return pay;
    }
    public void setHourlyPayRate(float hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }
    public void setHoursWorked(float hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public float getHoursWorked(){
        return (float) hoursWorked;
    }
    public float getRate(){
        return hourlyPayRate;
    } 
    public String toString(){
        return firstName + " " + lastName + "\n" + "Their daily average salary is ";
    }     
}
