class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc = 0;
        int c = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                mc = Math.max(mc, c);
                c = 0;
            }
        }
        mc = Math.max(mc, c);
        return mc;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna