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
        int mw = 0;
        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(0, root));
        while(!q.isEmpty())
        {
            int size = q.size();
            int li = -1;
            int ri = -1;
            for(int i=0 ; i<size ; i++)
            {
                pair p = q.poll();
                int ind = p.ind;
                TreeNode node = p.node;
                if(node.left!=null) q.offer(new pair(2*ind+1, node.left));
                if(node.right!=null) q.offer(new pair(2*ind+2, node.right));

                if(i==0) li = ind;
                if(i==size-1) ri = ind;
            }
            mw = Math.max(mw, ri-li+1);
        }
        return mw;
    }
}