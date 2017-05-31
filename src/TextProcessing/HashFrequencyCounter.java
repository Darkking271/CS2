/*
 * This program is the same as the frequency class, but it uses a hash table
 * than a binary tree.
 */
package TextProcessing;

import java.util.HashMap;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HashFrequencyCounter 
{  
    static HashMap<String, Integer> wordFreq = new HashMap<>();
    static Scanner keyboard = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
    throws FileNotFoundException 
    {
        establishFrequencyCounts();
        dump();
        interpret();
    }//END MAIN

    private static void establishFrequencyCounts() 
    throws FileNotFoundException 
    {
        ArrayList<String> words = getFile();
        populateTable(words);
    }//END establishFrequencyCounts

    private static ArrayList<String> getFile() 
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
    }//END getWords

    private static void populateTable(ArrayList<String> words) 
    {
        for (int i = 0; i < words.size(); i++)
        {
            if (wordFreq.containsKey(words.get(i)))
                wordFreq.put(words.get(i), wordFreq.get(words.get(i)) + 1);
            else
                wordFreq.put(words.get(i), 1);
        }
    }//END populateTable

    private static void dump() 
    {
        System.out.println("The Words:");
        for (String key: wordFreq.keySet())
            System.out.println("<" + key + ": " + wordFreq.get(key) + ">");
    }//END dump

    private static void interpret() 
    {
        String option;
        System.out.print(">>> ");
        option = keyboard.nextLine();
        while (!option.toLowerCase().equals("exit"))
        {
            switch (option.toLowerCase())
            {
                case "count":
                    wordCount();
                    break;
                case "print":
                    wordPrint();
                    break;
            }//END SWITCHcoun
            System.out.print(">>> ");
            option = keyboard.nextLine();
        }//END WHILE
    }//END interpret

    private static void wordCount() 
    {
        System.out.print("Word?   ");
        String word = keyboard.nextLine();
        if (wordFreq.containsKey(word))
        {
            int num = wordFreq.get(word);
            System.out.println(num);
        }
        else
            System.out.println("Word not found!");
    }//END wordStringCount

    private static void wordPrint() 
    {
        TreeSet<String> wordSet = new TreeSet<>();
        for (String key: wordFreq.keySet())
            wordSet.add(key);
        for (String s: wordSet)
            System.out.println("<" + s + ": " + wordFreq.get(s) + ">");
    }//END wordPrint
}
