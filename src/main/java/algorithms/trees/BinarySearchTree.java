package algorithms.trees;

import java.util.Objects;

public class BinarySearchTree {
    private Node root;

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    void insert(int key) {
        root = insertRecord(root, key);
    }

    private Node insertRecord(Node root, int key) {
        if (Objects.isNull(root)) {
            root = new Node(key);
            return root;
        } else if (key < root.key) {
            root.left = insertRecord(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecord(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRecord(root);
    }

    private void inorderRecord(Node root) {
        if (root != null) {
            inorderRecord(root.left);
            System.out.println(root.key);
            inorderRecord(root.right);
        }
    }

    /**
     * Driver Program to test above functions
     */
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
