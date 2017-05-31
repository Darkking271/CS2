/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alex
 */
public class KFrame8p extends JFrame implements ActionListener 
{    
    JTextArea output;
    JButton pointButton;
    JButton lineButton;
    JButton wordButton;
    JButton quoteButton;
    JButton colorButton;
    JButton clearButton;
    JTextField input;
    
    public KFrame8p(String title)
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
        pointButton = new JButton("Point");
        lineButton = new JButton("Line");
        wordButton = new JButton("Word");
        quoteButton = new JButton("Quote");
        colorButton = new JButton("Color");
        clearButton = new JButton("Clear");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(pointButton);
        controlPanel.add(lineButton);
        controlPanel.add(wordButton);
        controlPanel.add(quoteButton);
        controlPanel.add(colorButton);
        controlPanel.add(clearButton);
        
        //components central region
        output = new JTextArea();
        
        //components for southern region
        input = new JTextField();
        
        //establish the regions
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(output, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
        
    }//END addComponents
    
    //Add the listeners to the frame.
    private void addListeners()
    {
        pointButton.addActionListener(this);
        lineButton.addActionListener(this);
        wordButton.addActionListener(this);
        quoteButton.addActionListener(this);
        colorButton.addActionListener(this);
        clearButton.addActionListener(this);
        input.addActionListener(this);
        
    }//END addListeners
    
    //This method serves to implement the ActionListener interface
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() instanceof JTextField)
            input.setText("");
        
        switch(event.getActionCommand().toUpperCase())
        {
            case "POINT":
                newLine("POINT");
                break;
            case "LINE":
                newLine("LINE");
                break;
            case "WORD":
                newLine("WORD");
                break;
            case "QUOTE":
                newLine("QUOTE");
                break;
            case "COLOR":
                newLine("COLOR");
                break;
            case "CLEAR":
                newLine("CLEAR");
                break;
            case "CL":              //secret clear functionality
                output.setText("");
                break;
                
        }//END SWITCH
        
    }//END actionPerformed

    private void newLine(String word) 
    {
        output.append(word + "\n");
    }
       

}//END KFrame8p
