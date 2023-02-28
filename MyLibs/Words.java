package MyLibs;

public class Words{
    /**
     * Prints the string from the end to the beginning
     * @param input Any string
     */
    public static void reverse(String input){
        for (int i = input.length()-1; i >= 0; i--)
            System.out.print(input.charAt(i));
    }
    /**
     * Capitalizes the first letter of every word.
     * Can work with sentences.
     * @param word Takes a string
     * @return the word after capitalizing the first letter
     */
    public static String capitalizeFirstLetter(String word){
        String result = "";
        String[] words = word.split(" ");
        for (String i : words)
            result += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        return result.trim();
    }
}
