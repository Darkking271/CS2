/*
 * Unrefined linked list code that I refined
 */
package linearlists;

import java.util.LinkedList;
import java.text.DecimalFormat;

/**
 *
 * @author Alex
 */
public class LinkedListPlay 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Part 1: creation of lists
        
        LinkedList animals = createAnimalList();
        displayAnimals("\nThe Animal Names...", animals);
        
        LinkedList reals = randomList(77);
        displayReals("\nThe Real Numbers...", reals);
        
        //Part 2: use of lists
        
        LinkedList lengths = lengths(animals);
        displayLengths("\nThe lengths of the animal names...", lengths);
        
        LinkedList reverseAnimals = reverse(animals);
        displayAnimals("\nThe animals in reverse order...", reverseAnimals);
        
        double minimum = minimum(reals);
        System.out.println("\nThe minimum number = " + minimum);
        displayReals("\nThe real numbers...", reals);
        
        LinkedList orderList = sort(reals);
        displayReals("\nThe real numbers in ascending order...", orderList);
        displayReals("\nThe real numbers...", reals);
    }//END MAIN

    private static LinkedList createAnimalList() 
    {
     LinkedList<String> animals = new LinkedList<String>();
     
     //Predetermined Animals
     animals.add("Aardvark");
     animals.add("Bear");
     animals.add("Crocodile");
     animals.add("Dove");
     animals.add("Elephant");
     animals.add("Finch");
     animals.add("Giraffe");
     animals.add("Hyena");
     animals.add("Iguana");
     animals.add("Jackalope");
     animals.add("Bat");
     animals.add("Walrus");
     animals.add("Lobster");
     //My Animals
     animals.add("Lion");
     animals.add("Tiger");
     animals.add("Bison");
     animals.add("Woodpecker");
     animals.add("Panda");
     animals.add("Ox");
     animals.add("Yak");
     animals.add("Bull");
     animals.add("Elk");
     animals.add("Fox");
     
     return animals;
     
    }//END createAnimalList

    private static LinkedList randomList(int x) 
    {
        LinkedList<Double> reals = new LinkedList<Double>();
        DecimalFormat dec = new DecimalFormat(".#");
        int i = 0;
        
        while (i < x)
        {
            double num = (Math.random() * 1000) / 10;
            
            Double number = new Double(dec.format(num));
            
            reals.addLast(number);
            
            i++;
            
        }//END WHILE
        
        return reals;
        
    }//END randomList

    private static void displayAnimals(String text, LinkedList<String> animals) 
    {
        display(text, animals);
        
    }//END displayAnimals

    private static void displayLengths(String text, LinkedList<Integer> lengths) 
    {
        display(text, lengths);
        
    }//END displayLengths

    private static void displayReals(String text, LinkedList items) 
    {
        display(text, items);
        
    }//END displayReals

    private static LinkedList lengths(LinkedList<String> animals) 
    {
        LinkedList<Integer> lengths = new LinkedList<Integer>();
        
        for (String a : animals)
        {
            lengths.add(a.length());
            
        }//END FOR
        
        return lengths;
        
    }//END lengths

    private static LinkedList reverse(LinkedList<String> animals) 
    {
        LinkedList<String> reverseAnimals = new LinkedList<String>();
        
        for (int i = animals.size(); i > 0; i--)
            
            reverseAnimals.add(animals.get(i - 1));
        
        //END FOR
        
        return reverseAnimals;
        
    }//END reverse
    
    private static double minimum(LinkedList<Double> reals) 
    {
        double minimum = 100;
        
        for (int i = 0; i < reals.size(); i++)
        {
            if (reals.get(i) < minimum)
                
                minimum = reals.get(i);
            
        }//END IF
        
        return minimum;
            
    }//END minimum

    private static LinkedList sort(LinkedList<Double> reals) 
    {   
        LinkedList<Double> copy = new LinkedList<Double>(reals);
        
        if (copy.isEmpty())
            return copy;
        
        double min = minimum(reals);
        copy.remove(min);
        copy = sort(copy);
        copy.addFirst(min);
        return copy;
    }//END sort
    
    private static void display(String text, LinkedList items)
    {
        System.out.print(text + "\n< ");
        
        for (int i = 0; i < items.size(); i++)
        {
            System.out.print(items.get(i) + " ");
            
            if ((i + 1) % 10 == 0)
                
                System.out.println();
            
        }//END FOR
        
        System.out.println(" >");
        
    }//END display

}//END LinkedListPlay
