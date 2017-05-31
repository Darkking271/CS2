/*
 * The program is to prompt the user for a punctuation
 * free sentence with a single longest word and the print
 * the longest word.
 */
package Review;

import java.util.Scanner;

/**
 * @author Alex
 */
public class LongestWord 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Local Variables
        Scanner Keyboard = new Scanner(System.in);  //Keyboard variable
        String sent;                                //User's input sentence
        String word;                                //Longest word
        
        /********** Start Main Method **********/
        
        //Prompt use to input 
        System.out.print("Enter a sentence:  ");
        sent = Keyboard.nextLine();
        
        //Recieve the longest word
        word = longest(sent);
        
        //Display the longest word
        System.out.println(word);
    
    }//END main

    private static String longest(String sent) 
    {
        //Local Variables
        int maxLength = 0;                  //Highest length of words
        String[] word = sent.split(" ");    //Words in user's sentence
        String longWord = "";               //Longest word
        
        /**********Start Method**********/

        //For (every word in the sentence)
        for (int i = 0; i < word.length; i++)
        {
            //IF (the word is longer than the longest word)
            if (word[i].length() > maxLength)
            {
                //Make the word the longest word
                maxLength = word[i].length();
                
                //Set longest word length
                longWord = word[i];
            }//End IF
            
        }// End FOR
        
        //Return longest word
        return longWord;
    
    }//END longest
    
}//END LongestWord
