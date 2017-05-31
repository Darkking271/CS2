/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Alex
 */
public class FileChooser 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        String homedir = "C:/Users/Alex/Documents/School/2016 Fall/CSC-241/CS2F16";
        JFileChooser jfc = new JFileChooser(new File(homedir));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scanner = new Scanner(file);
        String token = "";
        while(scanner.hasNext())
        {
            token = scanner.next().toLowerCase();
            System.out.println(token);
        }
    }
    
}
