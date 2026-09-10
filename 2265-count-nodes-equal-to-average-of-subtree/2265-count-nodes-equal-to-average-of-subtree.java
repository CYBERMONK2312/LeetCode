/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;   
            if (Math.floor(sumNodes(root) / countNodes(root)) == root.val) {
                count++;    
            }
            count += averageOfSubtree(root.left);
            count += averageOfSubtree(root.right);
        return count;
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0; 
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int sumNodes(TreeNode root) {
        if (root == null) return 0;
        return root.val + sumNodes(root.left) + sumNodes(root.right);
    }
}