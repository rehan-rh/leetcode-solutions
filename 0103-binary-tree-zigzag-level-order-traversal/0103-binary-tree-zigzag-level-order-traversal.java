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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ml = new ArrayList<>();
        if(root==null) return ml;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int f = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0 ; i<size ; i++)
            {
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right !=  null) q.offer(curr.right);
                if(f==0)
                {
                    al.add(curr.val);
                }
                else
                {
                    al.add(0, curr.val);
                }
            }
            f = f==0?1:0;
            ml.add(al);
        }
        return ml;
    }
}