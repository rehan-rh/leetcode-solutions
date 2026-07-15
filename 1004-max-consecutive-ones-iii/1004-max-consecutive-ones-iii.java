class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int z = 0;
        int res = 0;
        while(r<n)
        {
            if(nums[r]==0) z++;
            if(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            if(z<=k)
            {
                res = Math.max(res, r-l+1);
            }
            r++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna