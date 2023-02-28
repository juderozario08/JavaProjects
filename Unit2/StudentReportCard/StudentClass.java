package Unit2.StudentReportCard;

public class StudentClass
{
    String name;
    int age;
    int RollNumber;
    float scores = 0;
    StudentClass(String name, int age, int RollNumber, float[] score)
    {
        // Set the values in this class to equal user's input
        name = name.trim();
        this.name = capitalizeFirstLetter(name);
        this.age = age;
        this.RollNumber = RollNumber;
        // Store all the set of scores in the scores variable in this class
        for(float i : score)
            this.scores += i;
    }
    float average(int numOfScores)
    {
        // This returns the average of the scores the user inputs
        return (float)(scores/numOfScores);
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