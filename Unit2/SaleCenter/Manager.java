package Unit2.SaleCenter;

public class Manager extends Employee
{
    private float yearlySalary;

    Manager(String firstName, String lastName, float yearlySalary) {
        super(firstName, lastName);
        this.setYearlySalary(yearlySalary);
    }
    @Override
    public float calculatePay() 
    {
        float pay = (float) (yearlySalary/52);
        return pay;
    }
    public void setYearlySalary(float yearlySalary){
        this.yearlySalary = yearlySalary;
    }
    public float getRate(){
        return yearlySalary;
    } 
    public String toString(){
        return firstName + " " + lastName + "\n" + "Their average weekly salary is ";
    }
}
