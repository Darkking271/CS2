/*
 * This main method class tests the binary tree class
 */
package trees;

import trees.BinaryTreeCreationException;
import trees.BinaryTree;
/**
 *
 * @author Alex
 */
public class BinaryTreeTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BinaryTreeCreationException
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
            t.addLR("lion", null, "");
            t.addLR("shark", null, "r");
            t.addLR("elephant", null, "l");
            t.addLR("zebra", null, "rr");
            t.addLR("alligator", null, "ll");
            t.addLR("ardvaark", null, "llr");
            t.addLR("tiger", null, "rrl");
            t.addLR("giraffe", null, "lr");
            t.addLR("bear", null, "llrr");
            t.addLR("snake", null, "rrll");
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
        System.out.println("Test BST ... ");
        BinaryTree<String, String> t = new BinaryTree<String, String>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the binary search tree ...");
        t.addST("Lion", null);
        t.addST("shark", null);
        t.addST("elephant", null);
        t.addST("zebra", null);
        t.addST("alligator", null);
        t.addST("ardvaark", null);
        t.addST("tiger", null);
        t.addST("giraffe", null);
        t.addST("bear", null);
        t.addST("snake", null);
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
        t.addND("lion", null);
        t.addND("shark", null);
        t.addND("elephant", null);
        t.addND("zebra", null);
        t.addND("alligator", null);
        t.addND("ardvaark", null);
        t.addND("tiger", null);
        t.addND("giraffe", null);
        t.addND("bear", null);
        t.addND("snake", null);
        System.out.println(">>> PREORDER");
        t.preorder();
        System.out.println(">>> INORDER");
        t.inorder();
        System.out.println(">>> POSTORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height());
        System.out.println("\n");
    }//END testND
    
}//END BinaryTreeTester
