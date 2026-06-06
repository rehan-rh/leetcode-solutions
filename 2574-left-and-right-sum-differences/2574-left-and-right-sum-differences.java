class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ls[] = new int[n];
        int rs[] = new int[n];
        ls[0] = 0;
        for(int i=1 ; i<n ; i++)
        {
            ls[i] = nums[i-1]+ls[i-1];
        }
        rs[n-1] = 0;
        for(int i=n-2 ; i>=0 ; i--)
        {
            rs[i] = nums[i+1]+rs[i+1];
        }

        for(int i=0 ; i<n ; i++)
        {
            nums[i] = Math.abs(ls[i] - rs[i]);
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna