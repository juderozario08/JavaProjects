package Unit2.Vehicle;

public class VehicleClass 
{
    protected String color;
    protected int noOfCylinders;
    protected String brand;

    protected VehicleClass(String color, int noOfCylinders, String brand)
    {
        // Set values for color and number of cylinders
        this.setColor(color);
        this.setNoOfCylinders(noOfCylinders);
        this.setBrand(brand);
    }
    protected String getColor()
    {
        // Make color available to the main function
        return color;
    }
    protected void setColor(String color)
    {
        // Sets color to user input
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1); 
    }
    protected int getNoOfCylinders()
    {
        // Make number of cylinders available to the main function
        return noOfCylinders; 
    }
    protected void setNoOfCylinders(int noOfCylinders)
    {
        // Sets number of cylinders to user input
        this.noOfCylinders = noOfCylinders;
    }
    protected void setBrand(String brand)
    {
        this.brand = brand.substring(0,1).toUpperCase() + brand.substring(1);
    }
    protected String getBrand()
    {
        return brand;
    }
    public String toString(){

        // Default print
        return "\nThe brand name of the vehicle is "+ getBrand()+".\nThe number of cylinders are "+getNoOfCylinders()
        + ".\nThe color of the vehicle is "+getColor()+".\n";
    }
}
