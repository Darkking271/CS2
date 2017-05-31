/*
 * This program takes a word file, and counts the frequency of each word
 */
package TextProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import trees.BinaryTree;
import trees.BinaryTreeCreationException;

/**
 *
 * @author Alex
 */
public class TreeFrequencyCounter 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws trees.BinaryTreeCreationException
     */
    public static void main(String[] args) 
    throws FileNotFoundException, BinaryTreeCreationException 
    {
        ArrayList<String> words = getFileWords();
        BinaryTree<String, Integer> tree = createTree(words);
        tree.inorder();
    }//END MAIN

    private static ArrayList<String> getFileWords() 
    throws FileNotFoundException
    {
        String homedir = "C:/Users/Alex/Documents/School/2016 Fall/CSC-241/CS2F16/Text Documents";
        JFileChooser jfc = new JFileChooser(new File(homedir));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = getWords(scanner);
        return words;
    }//END getFileText

    private static ArrayList<String> getWords(Scanner scanner) 
    {
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext())
        {
            words.add(scanner.next().toLowerCase());
        }
        return words;
    }//END copy

    private static BinaryTree<String, Integer> createTree(ArrayList<String> words) 
    throws BinaryTreeCreationException 
    {
        BinaryTree<String, Integer> tree = new BinaryTree<>();
        for (int i = 0; i < words.size(); i++)
        {
            if (tree.member(words.get(i)))
            {
                BinaryTree<String, Integer> node = tree.find(words.get(i));
                node.setValue(node.value() + 1);
            }
            else
                tree.addST(words.get(i),1);
        }
        return tree;
    }
    
}
