class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i=0 ; i<n ; i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                c++;
            }
        }
        return c<=1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna