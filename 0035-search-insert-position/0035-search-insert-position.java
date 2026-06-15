class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int res = n;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]>=target)
            {
                res = mid;
                h = mid-1;
            }
            else 
            {
                l = mid+1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna