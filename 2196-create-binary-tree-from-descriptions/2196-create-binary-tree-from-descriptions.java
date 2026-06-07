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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int a[] : descriptions)
        {
            int parent = a[0];
            int child = a[1];
            int isLeft = a[2];

            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child));

            TreeNode pNode = map.get(parent);
            TreeNode cNode = map.get(child);

            if(isLeft==1)
            {
                pNode.left = cNode;
            }
            else
            {
                pNode.right = cNode;
            }

            set.add(child);

        }

        for(int child : map.keySet())
        {
            if(!set.contains(child))
            {
                return map.get(child);
            }
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna