/*
 * Interface used for name program
 */
package simplethings;

/**
 *
 * @author Alex
 */
public interface NameADT 
{
    public String first();
    public String last();
    public String natural();
    public String formal();
    public String toString();
    public String initials();
    public boolean check(String fi, String li);
    
}//END NameADT
