/*
 * This class is meant to implement the NameADT interface
 */
package Testers;

import simplethings.Name;

/**
 *
 * @author Alex
 */
public class NameTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Name n = new Name("Cleo", "White");
        System.out.println("First Name = " + n.first());
        System.out.println("Last Name = " + n.last());
        System.out.println("Natural Name = " + n.natural());
        System.out.println("Formal Name = " + n.formal());
        
        if (n.check("C", "W"))
        
            System.out.println("Initials of " + n.natural() + " are " + "CW");
        
        else
        
            System.out.println("Initials of " + n.natural() + " are not " + "CW");
        
        if (n.check("W", "C"))
        
            System.out.println("Initials of " + n.natural() + " are " + "WC");
        
        else
            
            System.out.println("Initials of " + n.natural() + " are not " + "WC");
        
        
    }//END MAIN
    
}//NameTester
