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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode p = null;
        TreeNode curr = root;
        while(curr!=null)
        {
            p = curr;
            if(val<curr.val)
            {
                curr = curr.left;
            }
            else
            {
                curr = curr.right;
            }
        }
        if(p==null) return new TreeNode(val);
        if(val<p.val) p.left = new TreeNode(val);
        else p.right = new TreeNode(val);
        return root;

    }
}