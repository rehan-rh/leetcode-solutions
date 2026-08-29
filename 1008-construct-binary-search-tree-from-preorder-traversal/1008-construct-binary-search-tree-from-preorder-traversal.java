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
    TreeNode f(int a[], int ind[], long min, long max)
    {
        if(ind[0]==a.length || a[ind[0]]<=min || a[ind[0]]>=max)
        return null;
        TreeNode root = new TreeNode(a[ind[0]]);
        ind[0]++;
        root.left = f(a, ind, min, root.val);
        root.right = f(a, ind, root.val, max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return f(preorder, new int[]{0},  Long.MIN_VALUE, Long.MAX_VALUE);
    }
}