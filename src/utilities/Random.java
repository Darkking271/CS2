/*
 * Utility class to generate random colors and points
 */

package utilities;

import java.awt.Color;
import java.awt.Point;
//import java.awt.geom.Point2D;

/**
 *
 * @author Alex
 */
public class Random 
{
    String[] quote;
    String[] word;
    
    public Random()
    {
        quote = new String[10];
        quote[0] = "You must be the change you wish to see in the world."
                + "  --  Mahatma Gandhi";
        quote[1] = "Focus is a matter of deciding what things you're not going to do."
                + "  --  John Carmack";
        quote[2] = "Injustice anywhere is a threat to justice everytwhere."
                + "  --  Martin Lyther King Jr";
        quote[3] = "Never tell me the odds."
                + "  --  Han Solo";
        quote[4] = "When I left you, I was but the learner. Now I'm the master."
                + "  --  Darth Vader";
        quote[5] = "Have no fear of perfection, you'll never reach it"
                + "  --  Salvador Dali";
        quote[6] = "Make your own demons."
                + "  --  Tony Stark";
        quote[7] = "Winter is coming."
                + "  --  Ned Stark";
        quote[8] = "I don't want to fix the wheel, I want to break the wheel!"
                + "  --  Daenerys Targaryen";
        quote[9] = "If I say I'm dead, then I am. I'm not going to raise by balding head"
                + " on a beach in ten\nyears' time, saying all is well."
                + "  --  Trevor Philips";
        
        word = new String[10];
        word[0] = "Coffee  ::  Fuel source for programmers and engineers";
        word[1] = "DOOM  ::  John Carmack's flesh and blood, literally";
        word[2] = "Python  ::  Computer language for quitters";
        word[3] = "Guitar  ::  Axe with strings";
        word[4] = "Router  ::  A friend who never leaves your side";
        word[5] = "Laptop  ::  The other friend who never leaves";
        word[6] = "Phone  ::  Brick with lights and buttons";
        word[7] = "Music  ::  A series of vibrations";
        word[8] = "Apple  ::  Removing ports because of courage";
        word[9] = "Netflix  ::  Just one more episode";
    }//END constructor
    
    /** @return random color **/
    static public Color color()
    {
        int rv = number(256);
        int gv = number(256);
        int bv = number(256);
        return new Color(rv, gv, bv);
        
    }//END Color
    
    /** @return random **/
    public static String point(int x, int y)
    {
        int a = number(x);
        int b = number(y);
        String point = "(" + a + ", " + b + ")";
        return point;
        
    }//END Point
    
    public static String line (int x, int y)
    {
        int length = number(x);
        int angle = number(y);
        String line = length + " " + angle;
        return line;
        
    }//END 
    
    public String word ()
    {
        int x = number(10);
        return word[x];
    }//END word
    
    public String quote ()
    {
        int x = number(10);
        return quote[x];
    }
    
    private static int number(int x)
    {
        int rand = (int)(Math.random() * x);
        return rand;
        
    }//END number
    
}//END Random
