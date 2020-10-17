package algorithms.trees;

/**
 * Create complete binary tree from an array, this is also an algorithm for binary search tree
 */
public class CompleteBinaryTree {

    private static Node insert(int[] arr, int low, int high) {
        if(low > high){
            return null;
        }
        int mid = low + (high -low)/2;
        Node currentNode = new Node(arr[mid]);
        currentNode.left = insert(arr, low, mid -1);
        currentNode.right = insert(arr, mid + 1, high);
        return currentNode;
    }

    public static void main(String[] s) {
        Node root = insert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0, 9);
        System.out.println("The root of the tree is :: " + root.key);
        preOrderTraversal(root);
    }

    /**
     * Print the tree using pre order traversal
     * @param node
     */
    private static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.key);
    }

    /**
     * To check if the tree is a BST
     * @param node
     */
    private static boolean isBST(Node node){
        if(node==null){
            return true;
        }
        if(node.left!=null && (findMax(node.left) > node.key)){
            return false;
        }
        else if(node.right!=null && (findMin(node.right) < node.key)){
            return false;
        }
        return isBST(node.left) && isBST(node.right);
    }

    //TODO, implement find min
    private static int findMin(Node right) {
        return 0;
    }

    //todo, implement find max
    private static int findMax(Node left) {
        return 0;
    }
}
