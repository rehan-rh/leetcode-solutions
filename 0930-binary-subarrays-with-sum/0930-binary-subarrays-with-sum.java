class Solution {
    public int f(int nums[], int goal)
    {
        if(goal<0) return 0;
        int sum=0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        int res = 0;
        while(r<n)
        {
            sum += nums[r];
            while(sum>goal)
            {
                sum -= nums[l];
                l++;
            }
            if(sum<=goal)
            {
                res += r-l+1;
            }
            r++;
        }
        return res;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums, goal)-f(nums, goal-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna