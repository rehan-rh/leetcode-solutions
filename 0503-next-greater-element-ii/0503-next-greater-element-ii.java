class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int a[] = new int[n];
        for(int i=2*n-1 ; i>=0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
            {
                stack.pop();
            }
            if(i<n)
            {
                a[i] = stack.isEmpty()?-1:stack.peek();
            }
            stack.push(nums[i%n]);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna