/*
 * This program inplements the Binary Tree class to create a binary search tree
 * for colors
 */
package trees;

import trees.BinaryTree;
import trees.BinaryTreeCreationException;

/**
 *
 * @author Alex
 */
public class BinaryColorTreeTester 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    throws BinaryTreeCreationException
    {
        testLR(); //test deterministic insertion +
        testST(); //test bst insertion +
        testND(); //test nondeterministic insertion +
        testND(); //test nondeterministic insertion +
    }//END MAIN

    private static void testLR() 
    {
        System.out.println("Test LR ...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the tree directionally ...");
        try
        {
            t.addLR("Red", null, "");
            t.addLR("Blue", null, "l");
            t.addLR("Green", null, "lr");
            t.addLR("Black", null, "ll");
            t.addLR("White", null, "r");
            t.addLR("Purple", null, "lrr");
            t.addLR("Yellow", null, "rr");
            t.addLR("Orange", null, "lrrl");
            t.addLR("Indigo", null, "lrrll");
            t.addLR("Aqua", null, "lll");
            t.addLR("Tangerine", null, "rl");
            t.addLR("Pink", null, "lrrlr");
            t.addLR("Ghostwhite", null, "lrl");
            t.addLR("Gray", null, "lrlr");
            t.addLR("Brown", null, "lrll");
            t.addLR("Gainsboro", null, "lrllr");
        }
        catch (BinaryTreeCreationException ex)
        {
            ex.printStackTrace();
        }
        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
        System.out.println("\n");
    }//END testLR

    private static void testST() throws BinaryTreeCreationException
    {
        System.out.println("Test ST ... ");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the binary search tree ...");
        t.addST("Red", null);
        t.addST("Blue", null);
        t.addST("Green", null);
        t.addST("Black", null);
        t.addST("White", null);
        t.addST("Purple", null);
        t.addST("Yellow", null);
        t.addST("Orange", null);
        t.addST("Indigo", null);
        t.addST("Aqua", null);
        t.addST("Tangerine", null);
        t.addST("Pink", null);
        t.addST("Ghostwhite", null);
        t.addST("Gray", null);
        t.addST("Brown", null);
        t.addST("Gainsboro", null);
        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
        System.out.println("\n");
    }//END testST

    private static void testND() 
    {
        System.out.println("Test ND ...");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the tree nondetermistaically ...");
        t.addND("Red", null);
        t.addND("Blue", null);
        t.addND("Green", null);
        t.addND("Black", null);
        t.addND("White", null);
        t.addND("Purple", null);
        t.addND("Yellow", null);
        t.addND("Orange", null);
        t.addND("Indigo", null);
        t.addND("Aqua", null);
        t.addND("Tangerine", null);
        t.addND("Pink", null);
        t.addND("Ghostwhite", null);
        t.addND("Gray", null);
        t.addND("Brown", null);
        t.addND("Gainsboro", null);
        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
        System.out.println("\n");
    }//END testND
    
}//END BinaryColorTreeTester
