/*
 * This program is just like GUI8P, but with functionality
 */
package gui;

import frames.KFrame8;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alex
 */
public class GUI8 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new ThreadForGUI());
        
    }//END MAINE
    
    private static class ThreadForGUI implements Runnable
    {
        public void run()
        {
            GUI8 gui = new GUI8();
            
        }//END run
        
    }//END ThreadForGUI
    
    public GUI8()
    {
        KFrame8 frame = new KFrame8("GUI 8");
        
    }//END GUI8
    
}//END GUI8
