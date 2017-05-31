/*
 * Find the words in the sentence that are longer than
 * the average word length.
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class LongerWords 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {    
        //Local Variables
        Scanner Keyboard = new Scanner(System.in);  //Keyboard variable
        String sent;                                //User's input sentence
        String words;                               //Longest words
        
        /********** Start Main Method **********/
        
        //Prompt user to input sentence
        System.out.print("Enter a Sentence:  ");
        sent = Keyboard.nextLine();
        
        //Recieve the longest words
        words = longest(sent);
        
        //Display the longest words
        System.out.println("The longer words...");
        System.out.println(words);
        
    }//END MAIN

    private static String longest(String sent) 
    {
        //Local Variables
        int mean;                           //Average length of words
        int total = 0;                      //Number of words
        String longerWords = "";            //Words higher than average
        String[] word = sent.split(" ");    //Words in user's sentence
        
        /********** Start Method **********/
        
        //FOR (every word in the sentence)
        for (int i = 0; i < word.length; i++)
        {
            //Add the length of the word to the total
            total += word[i].length();
            
        }//END FOR
        
        //Calculate the average length of words
        mean = total / word.length;
        
        //FOR (every word in the sentence)
        for (int i = 0; i < word.length; i++)
        {    
            //IF (word is longer than average)
            if (word[i].length() > mean)
            {    
                //Add word to collection of words
                longerWords = longerWords + word[i] + "\n";
                
            }//END IF   
            
        }//END FOR
        
        //Return the longer words
        return longerWords;
                
    }//END longest
    
}//END LongerWords
