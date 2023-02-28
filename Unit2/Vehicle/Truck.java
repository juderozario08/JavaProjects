package Unit2.Vehicle;

public class Truck extends VehicleClass
{
    private int towingCapacity;

    Truck(String color, int noOfCylinders, int towingCapacity, String brand) 
    {
        // Inherits color and number of cylinders from and get towing capacity
        super(color, noOfCylinders, brand);
        this.setTowingCapacity(towingCapacity);
    }
    public void setTowingCapacity(int towingCapacity)
    {
        // Set towing capacity to users input
        this.towingCapacity = towingCapacity;
    }
    public int getTowingCapacity()
    {
        // Make the towing capacity accessible
        return towingCapacity;
    }
    public String toString()
    {
        // Return the truck information as a String
        String truckBrand = "The truck brand is "+getBrand()+".";
        String cylinders = "The number of cylinders are "+getNoOfCylinders()+".";
        String truckColor = "The color of the Truck is "+getColor()+".";
        String truckTowingCapacity = "The towing capacity of the Truck is " +getTowingCapacity()+ " kg.";
        return truckBrand + "\n" + truckColor + "\n" + cylinders + "\n" + truckTowingCapacity + "\n";
    }  
}
