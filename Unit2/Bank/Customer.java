package Unit2.Bank;

public class Customer 
{
    String firstName;
    String lastName; 
    String street;
    String city;
    String state; 
    String zip;

    Customer(String firstName, String lastName, String street, String city, String state, String zip)
    {
        firstName = firstName.trim();
        lastName = lastName.trim();
        city = city.trim();
        state = state.trim();
        zip = zip.trim();
        this.firstName = capitalizeFirstLetter(firstName);
        this.lastName = capitalizeFirstLetter(lastName);
        this.street = capitalizeFirstLetter(street);
        this.city = capitalizeFirstLetter(city);
        this.state = state.toUpperCase();
        this.zip = zip.toUpperCase();
    }

    public String changeStreet(String newStreet)
    {
        street = capitalizeFirstLetter(newStreet);
        return street;
    }
    public String changeCity(String newCity)
    {
        city = newCity.substring(0, 1).toUpperCase() + newCity.substring(1);
        return city;
    }
    public String changeState(String newState)
    {
        state = newState.toUpperCase();
        return state;
    }
    public String changeZip(String newZip)
    {
        zip = newZip.toUpperCase();
        return zip;
    }
    public String toString() 
    {
        return firstName.trim() + " " + lastName.trim() + "\n" + street.trim() + 
        "\n" + city.trim() + ", " + state.trim() + " " + zip.trim();
    }
    public String changeFirstName(String newFirstName)
    {
        newFirstName = newFirstName.trim();
        firstName = capitalizeFirstLetter(newFirstName);
        return firstName;
    }
    public String changeLastName(String newLastName)
    {
        newLastName = newLastName.trim();
        lastName = capitalizeFirstLetter(newLastName);
        return lastName;  
    }
    private String capitalizeFirstLetter(String passedValue) 
    {
        String[] words = passedValue.split(" ");
        String capitalizedString = "";
    
        for (String word : words) 
            capitalizedString += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        return capitalizedString.trim();
    }
}
