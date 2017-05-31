/*
 * Run the collatz sequence from a user inputed number.
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CollatzSequence 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Local Variables
        Scanner Keyboard = new Scanner(System.in);  //Keyboard variable
        int num;                                    //User's input number
        int count = 0;                              //Counter for formating lines
        
        /********** Start Main Method **********/
        
        //Prompt user to input positive integer
        System.out.print("The positive integer?   ");
        num = Keyboard.nextInt();
        System.out.print(num + " ");
        
        //WHILE (number is not 1)
        while (num != 1)
        {
            //IF (number is even)
            if (num % 2 == 0)
            {
                //Divide number by 2
                num = num / 2;
                
                //Display number
                System.out.print(num + " ");
                
                //Fit 10 per line
                count = format(count);
            }
            //ELSE (number is odd)
            else
            {
                //Multiply number by 3 and add 1
                num = num * 3 + 1;
                
                //Display Number
                System.out.print(num + " ");
                
                //Fit 10 per line
                count = format(count);
                
            }//END IF
            
        }//END WHILE
        
        //Extra Lines
        System.out.print("\n");
        
    }//END MAIN

    private static int format(int count) 
    {
        //Add one to counter
        count ++;
        
        //IF (ten number are in line
        if ((count + 1) % 10 == 0)
            
            //Go to next line
            System.out.println();
        
        //Return counter value
        return count;
        
    }//END fotrmat
    
}//END CollatzSequence
