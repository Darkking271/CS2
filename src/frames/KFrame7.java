/*
 * Frame for the GUI7 program.
 */

package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import utilities.Random;
/**
 *
 * @author Alex
 */
    //modeling the feature frame for the GUI

public class KFrame7 extends JFrame implements ActionListener
{
    private JPanel reflector;
    private JButton blueButton;
    private JButton redButton;
    private JButton greenButton;
    private JButton yellowButton;
    private JButton colorButton;
    private JTextField input;
    Random gen = new Random();
    
    public KFrame7(String title)
    {
        super(title);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
        
    }//END KFrame7
    
    private void addComponents(Container contentPane)
    {
        //components for northern region
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        yellowButton = new JButton("Yellow");
        colorButton = new JButton("Color");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(blueButton);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(yellowButton);
        controlPanel.add(colorButton);
        
        //components central region
        reflector = new JPanel();
        
        //components for southern region
        input = new JTextField();
        
        //establish the regions
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
        
    }//END addComponents
    
    //Add the listeners to the frame.
    private void addListeners()
    {
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        yellowButton.addActionListener(this);
        colorButton.addActionListener(this);
        input.addActionListener(this);
        
    }//END addListeners
    
    //This method serves to implement the ActionListener interface
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if (event.getSource() instanceof JTextField)
            input.setText("");
        
        switch(event.getActionCommand().toUpperCase())
        {
            case "RED":
                reflector.setBackground(Color.RED);
                break;
            case "YELLOW":
                reflector.setBackground(Color.YELLOW);
                break;
            case "BLUE":
                reflector.setBackground(Color.BLUE);
                break;
            case "GREEN":
                reflector.setBackground(Color.GREEN);
                break;
            case "COLOR":
                reflector.setBackground(Random.color());
                break;
                
        }//END SWITCH
        
    }//END actionPerformed
    
}//END KFrame7
