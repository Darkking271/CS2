/*
 * GUI6 is like GUI5, but with a different structure. The frame class
 * has been moved to a frame package.
 */
package gui;

import frames.KFrame6;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alex
 */
public class GUI6 
{

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
            GUI6 gui = new GUI6();
            
        }//END run
        
    }//END ThreadForGUI
    
    public GUI6()
    {
        KFrame6 frame = new KFrame6("GUI6");
        
    }//END GUI6
    
}//END GUI6
