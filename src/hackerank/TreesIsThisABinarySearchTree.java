package hackerank;

public class TreesIsThisABinarySearchTree {	
	/**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
	boolean checkBST(Node root) {
        // write your code here
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    private boolean helper(Node root, long max, long min) {
        if (root == null) return true;
        
        if (root.data >= max || root.data <= min) return false;
        
        // root.data is the maximum value relatively
        boolean left = helper(root.left, root.data, min);
        // root.data is the minimum value relatively
        boolean right = helper(root.right, max, root.data);
        
        return left && right;
    }
}
