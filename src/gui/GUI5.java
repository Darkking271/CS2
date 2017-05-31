/*
 * GUI5 is like GUI4 except that the central regian is replaced by
 * a panel which reflects the color of the most recenetly selected button.
 * This last bit -- the fact that the panel reflects the color, is something 
 * of a deal. The GUI respongs!
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alex
 */
public class GUI5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new ThreadForGUI());
        
    }//END MAIN
    
    private static class ThreadForGUI implements Runnable
    {
        @Override
        public void run()
        {
            GUI5 gui = new GUI5();
            
        }//END RUN
        
    }//END ThreadForGUI
    
    public GUI5()
    {
        KFrame frame = new KFrame("GUI 5");
        
    }//END GUI5
    
    //modeling the feature fram of the GUI
    
    public class KFrame extends JFrame implements ActionListener
    {
         private JButton blueButton;
         private JButton redButton;
         private JButton greenButton;
         private JButton yellowButton;
         private JPanel reflector;
         
         public KFrame (String title)
         {
             super(title);
             setSize(500,300);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             addComponents(getContentPane());
             addListeners();
             setVisible(true);
             
         }//END KFame
         
         private void addComponents(Container contentPane)
         {
             blueButton = new JButton("Blue");
             redButton = new JButton("Red");
             greenButton = new JButton("Green");
             yellowButton = new JButton("Yellow");
             reflector = new JPanel();
             contentPane.setLayout(new BorderLayout());
             contentPane.add(blueButton, BorderLayout.NORTH);
             contentPane.add(redButton, BorderLayout.SOUTH);
             contentPane.add(greenButton, BorderLayout.EAST);
             contentPane.add(yellowButton, BorderLayout.WEST);
             contentPane.add(reflector, BorderLayout.CENTER);
             
         }//END addComponents
         
         //Add the listeners to the frame
         
         private void addListeners()
         {
             blueButton.addActionListener(this);
             redButton.addActionListener(this);
             greenButton.addActionListener(this);
             yellowButton.addActionListener(this);
             
         }//END addListeners
         
         //This method serves to implement the ActionListener interface
         
         @Override
         public void actionPerformed(ActionEvent event)
         {
             String command = event.getActionCommand();
             if (command.equals("Red"))
                 reflector.setBackground(Color.RED);
             else if (command.equals("Yellow"))
                 reflector.setBackground(Color.YELLOW);
             else if (command.equals("Blue"))
                 reflector.setBackground(Color.BLUE);
             else if (command.equals("Green"))
                 reflector.setBackground(Color.GREEN);
         }//END actionPerformed
         
    }//END Frame
    
}//END GUI5
