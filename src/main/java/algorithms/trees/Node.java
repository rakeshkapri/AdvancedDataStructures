package algorithms.trees;

public class Node {
    public Node left;
    public Node right;
    public int key;
    public Node(int key){
        this.key = key;
        left = right = null;
    }
}
