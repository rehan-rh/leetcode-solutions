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
 class pair
 {
    TreeNode node;
    int ind;
    pair(TreeNode node, int ind)
    {
        this.node = node;
        this.ind = ind;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(root, 0));
        int max = 0;
        while(!q.isEmpty())
        {
            int s = q.size();
            int l = -1;
            int r = -1;
            for(int i=0 ; i<s ; i++)
            {
                pair p = q.poll();
                TreeNode curr = p.node;
                int ind = p.ind;
                if(i==0) l = ind;
                if(i==s-1) r = ind;
                if(curr.left!=null) q.offer(new pair(curr.left, 2*ind+1));
                if(curr.right!=null) q.offer(new pair(curr.right, 2*ind+2));
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}