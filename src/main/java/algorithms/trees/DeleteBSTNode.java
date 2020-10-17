package algorithms.trees;

/**
 * Class to demonstrate deletion from a BST
 */
public class DeleteBSTNode {

    public static void main(String[] s){
        Node root = new Node(0);
        deleteBST(root, 8);
    }

    private static Node deleteBST(Node node, int value) {
        if(node.key == value){
            if(node.left==null && node.right == null){
                return null;
            }
            else if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }else{
                Node minNode = findMin(node.right);
                node.key = minNode.key;
                node.right = deleteBST(node.right, minNode.key);
            }
        }else{
            if(node.key > value){
                node.left = deleteBST(node.left, value);
            }else{
                node.right = deleteBST(node.right, value);
            }
        }
        return node;
    }

    //TODO, create method find min node of right subtree
    private static Node findMin(Node right) {
        return null;
    }
}
