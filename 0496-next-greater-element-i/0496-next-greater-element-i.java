class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        for(int i=n-1 ; i>=0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums2[i])
            {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }

        for(int i=0 ; i<nums1.length ; i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna