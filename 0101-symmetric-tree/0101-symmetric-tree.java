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
    boolean f(TreeNode left, TreeNode right)
    {
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        return left.val==right.val && f(left.left, right.right) && f(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return f(root.left, root.right);
    }
}