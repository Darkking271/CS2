/*
 * Tester for the TriangleADT interface
 */
package Testers;

import simplethings.Triangle;

/**
 *
 * @author Alex
 */
public class TriangleTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Triangle edward = new Triangle(10);
        System.out.println(edward.toString());
        
        Triangle iris = new Triangle(3,4,5);
        System.out.println(iris.toString());
        
        System.out.println("Perimeter of equalateral = " + edward.perimeter());
        System.out.println("Perimeter of iris = " + iris.perimeter());
        System.out.println("Area of equalateral = " + edward.area());
        System.out.println("Area of iris = " + iris.area());
    }//END MAIN
    
}//END Triangle Tester
