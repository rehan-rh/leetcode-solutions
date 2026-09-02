class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        for(int i=n-1 ; i>=0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums2[i])
            stack.pop();
            map.put(nums2[i], stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        int n2 = nums1.length;
        int res[] = new int[n2];
        for(int i=0 ; i<n2 ; i++)
        {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}