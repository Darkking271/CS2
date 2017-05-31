/*
 * Interface for implementing a binary tree
 */
package trees;

/**
 *
 * @author Alex
 */
public interface BinaryTreeADT<K, V> 
{
    public V value();
    public void setValue(V value);
    public boolean empty();
    public int height();
    public void preorder();
    public void inorder();
    public void postorder();
    public void addLR(K key, V value, String dir) throws BinaryTreeCreationException;
    public void addND(K key, V value);
    public void addST(K key, V value) throws BinaryTreeCreationException;
    public V get(K key);
    public BinaryTree<K, V> find(K key);
    public boolean member(K key);
    public void visit();
    public void sprout(K key, V value);
}//END BinaryTreeADT
