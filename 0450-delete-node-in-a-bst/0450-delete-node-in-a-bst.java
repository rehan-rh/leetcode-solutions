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
    TreeNode suc(TreeNode root)
    {
        TreeNode curr = root.right;
        while(curr.left!=null)
        {
            curr = curr.left;
        }
        return curr;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val) root.left = deleteNode(root.left, key);
        else if(key>root.val) root.right = deleteNode(root.right, key);
        else
        {
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            else
            {
                TreeNode suc = suc(root);
                root.val = suc.val;
                root.right = deleteNode(root.right, suc.val);
            }
        }
        return root;
    }
}