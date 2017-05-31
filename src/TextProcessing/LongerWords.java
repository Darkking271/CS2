/*
 * This program will read a text file for a song or poem, and print words longer
 * than average
 */
package TextProcessing;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class LongerWords 
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        String[] words;
        String in;
        
        System.out.print("Lyrics or Poem?:  ");
        in = keyboard.nextLine();
        in = in.toLowerCase();
        System.out.println();
        
        switch (in)
        {
            case "lyrics":
                recieveFile("Flickering Flame.txt");
                break;
            case "poem": 
                recieveFile("The Wicked.txt");
                break;
        }//END SWITCH
        
        
    }//END MAINE

    private static void recieveFile(String link) throws Exception
    {
        FileReader file = new FileReader("C:/Users/Alex/Documents/School/2016 Fall/CSC-241/CS2F16/Text Documents/" + link);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        
        while (line != null)
        {
            text += line;
            line = reader.readLine();
        }//END WHILE
        
        String[] words = text.split(" ");
        ArrayList<String> longest = longestWords(words);
        display(longest);
    }

    private static ArrayList<String> longestWords(String[] list) 
    {  
        int mean;
        int total = 0;
        ArrayList<String> longer = new ArrayList<>();
        
        for (String list1 : list) 
        {
            total += list1.length();
        } //END FOR
        
        mean = total / list.length;
        
        for (String list1 : list) 
        {
            if (list1.length() > mean) 
                longer.add(list1);
        } //END FOR
        
        return longer;
        
    }//END longestWords

    private static void display(ArrayList<String> list) 
    {
        System.out.println("The longer words...\n");
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
            
            if ((i + 1) % 10 == 0)
                System.out.println();
        }//END FOR
        
        System.out.println();
    }
    
}//END LONGER WORDS
