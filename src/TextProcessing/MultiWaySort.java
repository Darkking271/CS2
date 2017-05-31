/*
 * 
 */
package TextProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alex
 */
public class MultiWaySort 
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> words = initialOrder();
        LinkedList<String> pass1 = pass1(words);
        pass2(pass1);
    }//END MAIN

    private static LinkedList pass1(ArrayList<String> words) 
    {
        ArrayList<Queue> vowels = createEmptyVowelQueues(words);
        vowels = sortVowels(words, vowels);
        displayPass1(vowels);
        System.out.println();
        LinkedList<String> betweenPass = transferQueues(vowels);
        displayList("Words sorted by vowel count: ", betweenPass);
        return betweenPass;
    }//END pass1

    private static void pass2(LinkedList<String> pass1) 
    {
        ArrayList<Queue> letters = createEmptyLetterQueues(pass1);
        letters = sortLetters(pass1, letters);
        displayPass2(letters);
        System.out.println();
        LinkedList<String> finalPass = transferQueues(letters);
        displayList("Words sorted by vowel count and letter count: ", finalPass);
        System.out.println("\n");
    }

    private static ArrayList<String> initialOrder() throws Exception
    {
        ArrayList<String> words = getFile();
        displayInitialOrder(words);
        return words;
    }//END initialOrder

    private static ArrayList<String> getFile() throws FileNotFoundException
    {
        String homedir = "C:/Users/Alex/Documents/School/2016 Fall/CSC-241/CS2F16/Text Documents";
        JFileChooser jfc = new JFileChooser(new File(homedir));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scanner = new Scanner(file);
        ArrayList<String> words = getWords(scanner);
        return words;        
    }//END getFile
    
    private static ArrayList<String> getWords(Scanner scanner) 
    {
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext())
        {
            words.add(scanner.next().toLowerCase());
        }
        return words;
    }//END copy

    private static void displayInitialOrder(ArrayList<String> words) 
    {
        System.out.println("Initial Order:");
        for (int i = 0; i < words.size(); i++)
        {
            System.out.print(words.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }//END FOR
        System.out.println("\n");
    }//END displayInitialOrder

    private static ArrayList createEmptyVowelQueues(ArrayList<String> words) 
    {
        ArrayList<Queue> vowels = new ArrayList<>();
        Queue<String> queue;
        int highestVowelCount = highestVowelCount(words);
        for (int i = 0; i < highestVowelCount + 1; i++)
        {
            queue = new LinkedList<>();
            vowels.add(queue);
        }//END FOR
        
        return vowels;
    }//END createEmptyVowelQueues

    private static int highestVowelCount(ArrayList<String> words) 
    {
        int most = 0;
        int vowel;
        char letter;
        
        for (String s: words)
        {
            vowel = 0;
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i ++)
            {
                letter = s.charAt(i);
                if (testVowel(letter))
                    vowel++;
            }//END FOR
            if (vowel > most)
                most = vowel;
        }//END FOR
        return most;
    }//END highestVowelCount

    private static boolean testVowel(char i) 
    {
        boolean check = false;
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
            check = true;
        
        return check;
    }

    private static ArrayList sortVowels(ArrayList<String> words, ArrayList<Queue> vowels) 
    {
        for (String s: words)
        {
            s = s.toLowerCase();
            int vowelCount = vowelCount(s);
            vowels.get(vowelCount).add(s);
        }//END FOR
        
        return vowels;
    }//END sortVowels

    private static int vowelCount(String s) 
    {
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            char letter = s.charAt(i);
            if (testVowel(letter))
                vowelCount++;
        }//END FOR
        
        return vowelCount;
    }

    private static void displayPass1(ArrayList<Queue> vowels) 
    {
        System.out.println("Pass 1:");
        for (int i = 0; i < vowels.size(); i++)
        {
            System.out.print(i + " vowels: [ ");
            Queue queue = vowels.get(i);
            displayQueue(queue);
            System.out.println("]");
        }//END FOR
    }//END displayPass1

    private static ArrayList createEmptyLetterQueues(LinkedList<String> pass1) 
    {
        ArrayList<Queue> letters = new ArrayList<>();
        Queue<String> queue;
        int highestLetterCount = highestLetterCount(pass1);
        for (int i = 0; i < highestLetterCount; i++)
        {
            queue = new LinkedList<>();
            letters.add(queue);
        }//END FOR
        return letters;      
    }//END createEmptyLetterQueues

    private static int highestLetterCount(LinkedList<String> pass1) 
    {
        int most = 0;
        int letter;
        
        for (String s: pass1)
        {
            letter = s.length();
            if (letter > most)
                most = letter;
        }//END FOR
        return most;       
    }//END highestLetterCount

    private static ArrayList sortLetters(LinkedList<String> pass1, ArrayList<Queue> letters) 
    {        
        for (String s: pass1)
        {
            s = s.toLowerCase();
            letters.get(s.length() - 1).add(s);
        }//END FOR
        
        return letters;
    }//END sortLetters

    private static void displayPass2(ArrayList<Queue> letters) 
    {
        System.out.println("\n\nPass 2:");
        for (int i = 0; i < letters.size(); i++)
        {
            System.out.print(i + 1 + " letters: [ ");
            Queue queue = letters.get(i);
            displayQueue(queue);
            System.out.println("]");
        }//END FOR        
    }//END displayPass2

    private static void displayQueue(Queue queue) 
    {
        Queue copy = new LinkedList(queue);
        int size = copy.size();
        for (int i = 0; i < size; i++)
        {
            System.out.print(copy.element() + " ");
            copy.remove();
            if ((i + 1) % 10 == 0)
                System.out.println();
        }//END FOR
    }

    private static void displayList(String text, LinkedList<String> betweenPass) 
    {
        System.out.println(text);
        for (int i = 0; i < betweenPass.size(); i++)
        {
            System.out.print(betweenPass.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }//END FOR
    }//END displayList

    private static LinkedList<String> transferQueues(ArrayList<Queue> words) 
    {
        LinkedList transferList = new LinkedList();
        Queue copy;
        int size;
        for (int i = 0; i < words.size(); i++)
        {
            copy = new LinkedList(words.get(i));
            size = copy.size();
            for (int e = 0; e < size; e++)
            {
                transferList.add(copy.element());
                copy.remove();
            }
        }//END FOR
        
        return transferList;
    }//END betweenPas
    
}//END MultiWaySort
