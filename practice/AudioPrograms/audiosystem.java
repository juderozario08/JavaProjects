package practice.AudioPrograms;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;


public class audiosystem 
{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        Scanner input = new Scanner(System.in);

        // Create a file to get the music file
        File file = new File("/Users/juderozario/Documents/java/practice/AudioPrograms/Violet Evergarden - The Ultimate Price.wav");
        
        // Get the audio stream with the name of the same file that was created
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        // Instantiate the audio clip
        Clip clip = AudioSystem.getClip();
        
        // Open the audio that we opened in the file
        clip.open(audioStream);
        String choice = ""; 
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        while (!choice.equals("Q"))
        {
            System.out.println("(P) to play");
            System.out.println("(S) to Stop");
            System.out.println("(R) to Reset");
            System.out.println("(Q) to Quit");
            choice = input.nextLine();
            choice = choice.toUpperCase();
            switch(choice)
            {
                case ("P"): clip.start();
                volume.setValue(-10.0f);
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;    
                case ("Q"): clip.close();
                break;
                default: System.out.println("Not a valid response");   
            }
        }
        System.out.println("Bye!!");
        input.close();
    }
}
