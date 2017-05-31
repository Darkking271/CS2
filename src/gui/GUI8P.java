/*
 * GUI8P is like GUI7 except that the central region is given a
 * JTextArea in place of the JPanel and command execution amounts to
 * displaying the name of the action command in the text area -- and 
 * that the commands have changed
 */
package gui;

import frames.KFrame8p;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alex
 */
public class GUI8P 
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
            GUI8P gui= new GUI8P();
            
        }//END  run
        
    }//END ThreadForGUI
    
    public GUI8P()
    {
        KFrame8p frame = new KFrame8p("GUI 8P");
        
    }//END GUI8P
}//END GUI8P
