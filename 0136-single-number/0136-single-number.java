class Solution {
    public int singleNumber(int[] nums) {
        int c = 0;
        for(int e:nums)
        {
            c ^= e;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna