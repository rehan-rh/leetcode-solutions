class Solution {
    int sum(int[] a, int goal)
    {
        if(goal<0) return 0;
        int n = a.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int ans = 0;
        while(r<n)
        {
            sum+=a[r]%2;
            while(sum>goal)
            {
                sum-=a[l]%2;
                l++;
            }
            if(sum<=goal)
            {
                ans += (r-l+1);
            }
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return sum(nums, k) -sum(nums, k-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna