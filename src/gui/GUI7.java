/*
 * GUI7 is like GUI6 except that the buttons are now all placed
 * in the northern region, a text field is placed in the southern region
 * and the east and west regions are eliminated. Action commands
 * corresponding to the button names that are typed into the text area are
 * interpreted as though buttons were pressed, except that cas does not
 * matter. Also, random color functionality is added.
 */
package gui;

import frames.KFrame7;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alex
 */
public class GUI7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new ThreadForGUI());
        
    }//END MAIN
    
    private static class ThreadForGUI implements Runnable
    {
        public void run()
        {
            GUI7 gui = new GUI7();
            
        }//END run
        
    }//END ThreadForGUI
    
    public GUI7()
    {
        KFrame7 frame = new KFrame7("GUI 7");
        
    }//END GUI7
    
}//END GUI7
