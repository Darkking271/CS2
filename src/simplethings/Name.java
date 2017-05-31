/*
* This implements the NameADT interrface
*/
package simplethings;
 
/**
*
* @author Alex
*/
public class Name implements NameADT 
{
     
     private String firstName;
     private String lastName;
     
     public Name(String first, String last) 
     {
         firstName = first;
         lastName = last;  
         
     }//END Name
 
     @Override
     public String first() 
     {
         return firstName;
         
     }//END first
 
     @Override
     public String last() 
     {
         return lastName;
         
     }//END last
 
     @Override
     public String natural() 
     {
         return firstName + " " + lastName;
         
     }//END natural
 
     @Override
     public String formal() 
     {
         return lastName + ", " + firstName;
         
     }//END formal
     
     @Override
     public String toString()
     {
         return firstName + " " + lastName;
         
     }//END toString
     
     @Override
     public String initials()
     {
         String firstLetter = firstName.substring(0,1);
         String lastLetter = lastName.substring(0,1);
         return firstLetter + lastLetter;
         
     }//END initials
 
     @Override
     public boolean check(String fi, String li) {
         String first = firstName.substring(0,1);
         String last = lastName.substring(0,1);
         return (fi.equals(first))&(li.equals(last));
     
     }//END check

}//END Name Class
 