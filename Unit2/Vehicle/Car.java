package Unit2.Vehicle;

public class Car extends VehicleClass
{
    private int noOfSeats;

    Car(String color, int noOfCylinders, int noOfSeats, String brand) 
    {
        // Inherits color and number of cylinder from vehicle class and set the number of seats
        super(color, noOfCylinders, brand);
        this.setNoOfSeats(noOfSeats);
    }
    public void setNoOfSeats(int noOfSeats)
    {
        // Set number of seats to user input
        this.noOfSeats = noOfSeats;
    } 
    public int getNoOfSeats()
    {
        // Make number of seats accessible to main function
        return noOfSeats;
    }
    public String toString()
    {
        // Return the car information as a String
        String carBrand = "The car brand is "+getBrand()+".";
        String carColor = "The color of the Car is "+getColor()+".";
        String cylinders = "The number of cylinders are "+getNoOfCylinders()+".";
        String carSeats = "The number of seats in the Car is " +getNoOfSeats()+ ".";
        return carBrand + "\n" + carColor + "\n" + cylinders + "\n" + carSeats + "\n";
    }  
}
