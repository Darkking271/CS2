/*
 * 
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import utilities.Random;

/**
 *
 * @author Alex
 */
public class KFrame8 extends JFrame implements ActionListener 
{    
    JTextArea output;
    JButton pointButton;
    JButton lineButton;
    JButton wordButton;
    JButton quoteButton;
    JButton colorButton;
    JButton clearButton;
    JTextField input;
    Random gen = new Random();
    
    public KFrame8(String title)
    {
        super(title);
        setSize(500, 600);
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
                newPoint();
                break;
            case "LINE":
                newPointLine();
                break;
            case "WORD":
                newWord();
                break;
            case "QUOTE":
                newQuote();
                break;
            case "COLOR":
                output.setBackground(Random.color());
                break;
            case "CLEAR":
                output.setText("");
                output.setBackground(Color.WHITE);
                break;
                                
        }//END SWITCH
        
    }//END actionPerformed

    private void newLine(String word) 
    {
        output.append(word + "\n\n");
        
    }//END newLine
    
    private void newPoint()
    {
        newLine(Random.point(500, 600));
        
    }//END newPoint
    
    private void newPointLine()
    {
        newLine(Random.point(500, 600) + 
                " " + Random.line(600, 359));
        
    }//END newPointLine
    
    private void newWord()
    {
        newLine(gen.word());
        
    }//END newWord
       
    private void newQuote()
    {
        newLine(gen.quote());
        
    }//END newQuote

}//END KFrame8p
