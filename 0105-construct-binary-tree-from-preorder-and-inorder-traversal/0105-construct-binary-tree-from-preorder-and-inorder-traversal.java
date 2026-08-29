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
    TreeNode f(int pre[], int preSta, int preEnd, int in[], int inSta, int inEnd, HashMap<Integer, Integer> map)
    {
        if(preSta>preEnd || inSta>inEnd) return null;
        TreeNode root = new TreeNode(pre[preSta]);
        int rootInd = map.get(root.val);
        int leftLen = rootInd - inSta;
        int rightLen = inEnd - rootInd;
        root.left = f(pre, preSta+1, preSta+leftLen, in, inSta, rootInd-1, map);
        root.right = f(pre, preSta+1+leftLen, preEnd, in, rootInd+1, inEnd, map);;
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<inorder.length ; i++)
        {
            map.put(inorder[i], i);
        }
        return f(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }
}