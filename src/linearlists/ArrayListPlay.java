/*
 * This is the unrefined code that I refined
 */
package linearlists;
import java.util.ArrayList;
import simplethings.Name;
import simplethings.Triangle;

/**
 *
 * @author Alex
 */
public class ArrayListPlay 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Part 1: creation of lists
        ArrayList<String> songs = createSongList();
        display("The songs ... ", songs);
        ArrayList<Name> actors = creatActorList();
        display("The actors ... ", actors);
        ArrayList<Triangle> triangles = creatTriangleList();
        display("The triangles ... ", triangles);
        
        //Part 2: Use the Lists
        displayLengths(songs);
        displayInitials(actors);
        displayAreas(triangles);
    }//END MAIN

    private static ArrayList<String> createSongList() 
    {
        ArrayList<String> songs = new ArrayList<String>();
        
        songs.add("Happy");
        songs.add("Dog Days are Over");
        songs.add("Budapest");
        songs.add("Give Me Your Eyes");
        songs.add("Castle of Glass");
        songs.add("Heralds");
        songs.add("No Rest for the Wicked");
        songs.add("Death from Above");
        
        return songs;
        
    }//END createSongList
    
    private static ArrayList<Name> creatActorList() 
    {
        ArrayList<Name> actors = new ArrayList<Name>();
         
        Name ryan = new Name("Ryan", "Reynolds");
        Name hugh = new Name("Hugh", "Jackman");
        Name zach = new Name("Zach", "Braff");
        Name bradley = new Name("Bradley", "Cooper");
        Name halle = new Name("Halle", "Berry");
        Name kate = new Name("Kate", "Mara");
        Name kevin = new Name("Kevin", "Spacey");
        
        actors.add(ryan);
        actors.add(hugh);
        actors.add(zach);
        actors.add(bradley);
        actors.add(halle);
        actors.add(kate);
        actors.add(kevin);
        
        return actors;
        
    }//END creatActorList

    private static ArrayList<Triangle> creatTriangleList() 
    {
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        
        Triangle jupiter  = new Triangle(30);
        Triangle nexus = new Triangle(6,12,9);
        Triangle nebula = new Triangle(3,4,5);
        Triangle nova = new Triangle(10);
        Triangle singularity = new Triangle(12);
        Triangle neptune = new Triangle(12,13,14);
        
        triangles.add(jupiter);
        triangles.add(nexus);
        triangles.add(nebula);
        triangles.add(nova);
        triangles.add(singularity);
        triangles.add(neptune);
        
        return triangles;
        
    }//END createTriangleList
    
    private static void display(String text, ArrayList items) 
    {
        System.out.println("\n" + text);
        
        for (int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i));
            
        }//END FOR
        
    }//END display

    private static void displayLengths(ArrayList<String> songs) 
    {
        System.out.println("\n" + "The Song Lengths...");
        
        for (int i = 0; i < songs.size(); i++)
        {
            System.out.println(songs.get(i).length());
            
        }//END FOR
        
    }//END displayLengths

    private static void displayInitials(ArrayList<Name> actors) 
    {
        System.out.println("\n" + "The Initials");
        
        for (int i = 0; i < actors.size(); i++)
        {
            System.out.println(actors.get(i).initials());
            
        }//END FOR
        
    }//END displayIntials

    private static void displayAreas(ArrayList<Triangle> triangles) 
    {
        System.out.println("\n" + "The Areas");
        
        for (int i = 0; i < triangles.size(); i++)
        {
            System.out.println(triangles.get(i).area());
            
        }//END FOR
        
    }//END displayAreas

}//END ArrayListPlay
