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
    TreeNode suck(TreeNode root)
    {
        TreeNode curr = root.right;
        while(curr.left!=null)
        {
            curr = curr.left;
        }
        return curr;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key<root.val) root.left = deleteNode(root.left, key);
        else if(key>root.val) root.right = deleteNode(root.right, key);
        else
        {
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;
            else
            {
                TreeNode suck = suck(root);
                root.val = suck.val;
                root.right = deleteNode(root.right, suck.val);
            }
        }
        return root;
    }
}