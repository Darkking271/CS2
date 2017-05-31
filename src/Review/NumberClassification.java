/*
 * Classify 25 3 digit numbers its different categories
 */
package Review;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class NumberClassification 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Local Variables
        Random generator = new Random();    //Random number generator
        int num;                            //Random number
        int count = 0;                      //Number of random digits generated
        String all = "";                    //Numbers generated
        String odd = "";                    //Odd numbers
        String even = "";                   //Even numbers
        String mixed = "";                  //Mixed numbers
        String pairs = "";                  //Paired numbers
        
        /********** Start Main Method **********/
        
        //Generate random number
        num = generator.nextInt(900) + 100;
        
        //Count 1
        count++;
        
        //WHILE (count is not 25)
        while (count != 26)
        {
            //Add number to list of numbers
            all = all + num + " ";
            
            //IF (number consists of odd number)
            if (testOdd(num))
            {
                //Add number to odd numbers
                odd = odd + num + " ";
            }    
            //ELSE IF (number consists of even numbers)
            else if (testEven(num))
            {
                //Add number to even numbers
                even = even + num + " ";
            }
            //ELSE IF (number consists of mixed numbers
            else if (testMixed(num))
            {
                //Add number to mixed numbers
                mixed = mixed + num + " ";
            }
            //ELSE IF (number consists of pairs)
            else if (testPairs(num))
            {
                //Add number to paired numbers
                pairs = pairs + num + " ";
                
            }//END IF
                
            //Generate random number
            num = generator.nextInt(900) + 100;
        
            //Count 1
            count++;
            
        }//END WHILE
        
        //Display the generated numbers
        display("The Numbers...", all);
        
        //Display odd numbers
        display("The odd digit numbers...", odd);
        
        //Display even numbers
        display("The even digit numbers...", even);
        
        //Display the mixed digit numbers
        display("The mixed digit numbers...", mixed);
        
        //Display the pairs
        display("The pairs...", pairs);
        
    }//END MAIN

    private static boolean testOdd(int num)
    {
        String temp;                //Temporary string
        int[] digit = new int[3];   //Digit array
        boolean value = false;      //Return value
        
        /********** Start Method **********/
        
        //Convert number into string
        temp = Integer.toString(num);
        
        //FOR (every digit in the number)
        for (int i = 0; i < 3; i++)
        {
            //store digit in array
            digit[i] = temp.charAt(i);
            
        }//END FOR
        
        //If all three numbers are odd
        if (digit[0] % 2 != 0 && digit [1] % 2 != 0 && digit [2] % 2 != 0)
            
            //Set return value to true
            value = true;
        
        //END IF
        
        //Return value
        return value;
        
    }//END testOdd

    private static boolean testEven(int num) 
    {
        String temp;                //Temporary string
        int[] digit = new int[3];   //Digit array
        boolean value = false;      //Return value
        
        /********** Start Method **********/
        //Convert number into string
        temp = Integer.toString(num);
        
        //FOR (every digit in the number)
        for (int i = 0; i < 3; i++)
        {
            //store digit in array
            digit[i] = temp.charAt(i);
            
        }//END FOR
        
        //IF (all three numbers are even)
        if(digit[0] % 2 == 0 && digit [1] % 2 == 0 && digit[2] % 2 == 0)
            
            //Set return value to true
            value = true;
        
        //END IF
        
        //Return value
        return value;
        
    }//END testEven

    private static boolean testMixed(int num) 
    {
        String temp;                //Temporary string
        int[] digit = new int[3];   //Digit array
        boolean value = false;      //Return value
        
        /********** Start Method **********/
        //Convert number into string
        temp = Integer.toString(num);
        
        //FOR (every digit in the number)
        for (int i = 0; i < 3; i++)
        {
            //store digit in array
            digit[i] = temp.charAt(i);
            
        }//END FOR
        
        //IF (all three numbers are different)
        if(digit[0] != digit [1] && digit [1] != digit[2] && digit[0] != digit[2])
            
            //Set return value to true
            value = true;
        
        //END IF
        
        //Return value
        return value; 
        
    }//END testMixed

    private static boolean testPairs(int num) 
    {
        String temp;                //Temporary string
        int[] digit = new int[3];   //Digit array
        boolean value = false;      //Return value
        
        /********** Start Method **********/
        //Convert number into string
        temp = Integer.toString(num);
        
        //FOR (every digit in the number)
        for (int i = 0; i < 3; i++)
        {
            //store digit in array
            digit[i] = temp.charAt(i);
            
        }//END FOR
        
        //IF (digit 1 is equal to digit 2)
        if(digit [0] == digit[1])
            
            //Set return value to true
            value = true;
        
        //ELSE IF (digit 2 is equal to digit 3)
        else if (digit[1] == digit[2])
            
            //Set return value to true
            value = true;
        
        //ELSE IF (digit 1 is equal to digit 3)
        else if (digit[0] == digit[2])
        
            //Set return value to true
            value = true;
        
        //END IF
        
        //Return value
        return value;
        
    }//END testPairs
    
    public static void display(String text, String num)
    {
        System.out.println(text + "\n" + num + "\n");
    }
    
}//END NumberClassification
