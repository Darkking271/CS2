/*
 * Exception class for binary tree
 */
package trees;

/**
 *
 * @author Alex
 */
public class BinaryTreeCreationException extends Exception
{
    //Creates instance of the binary tree without detail message
    public BinaryTreeCreationException()
    {
    }
    //Creates instance of the binary tree with specified detail message
    public BinaryTreeCreationException(String msg)
    {
        super(msg);
    }
}
