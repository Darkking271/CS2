/*
 * Class to implement TriangleADT
 */
package simplethings;

/**
 *
 * @author Alex
 */
public class Triangle implements TriangleADT
{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    
    public Triangle(int side1, int side2, int side3)
    {
        sideOne = side1;
        sideTwo = side2;
        sideThree = side3;
        
    }//END Triangle
    
    public Triangle(int sides)
    {
        sideOne = sides;
        sideTwo = sides;
        sideThree = sides;
        
    }//END Triangle Overloaded
    
    @Override
    public String toString()
    {
        String type = "<Triangle with A = " + sideOne + 
                      ", B = " + sideTwo + 
                      ", C = " + sideThree + ">";
        return type;
    }
    
    @Override
    public double perimeter()
    {
        double perimeter = sideOne + sideTwo + sideThree;
        return perimeter;
        
    }//END perimeter
    
    @Override
    public double area()
    {
        double p = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
        return area;
        
    }//END area
    
}//END Triangle Class
