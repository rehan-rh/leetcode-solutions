class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int e : nums)
        {
            cs = Math.max(e, cs+e);
            ms = Math.max(ms, cs);
        }
        return ms;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna