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
    int ind;
    TreeNode node;
    pair(int ind, TreeNode node)
    {
        this.ind = ind;
        this.node = node;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int res = 0;
        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(0, root));
        while(!q.isEmpty())
        {
            int s = q.size();
            int l = -1;
            int r = -1;
            for(int i=0 ; i<s ; i++)
            {
                pair p = q.poll();
                int ind = p.ind;
                TreeNode curr = p.node;
                if(i==0) l = ind;
                if(i==s-1) r = ind;

                if(curr.left!=null) q.offer(new pair(2*ind+1, curr.left));
                if(curr.right!=null) q.offer(new pair(2*ind+2, curr.right));
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}