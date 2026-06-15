class Solution {
    public int sp(int nums[], int x)
    {
        int l = 0;
        int h = nums.length-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==x)
            {
                res = mid;
                h = mid-1;
            }
            else if (x<nums[mid])
            {
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return res;
    }
    public int ep(int nums[], int x)
    {
        int l = 0;
        int h = nums.length-1;
        int res = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==x)
            {
                res = mid;
                l = mid+1;
            }
            else if (x<nums[mid])
            {
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int sp = sp(nums, target);
        if(sp==-1) return new int[]{-1, -1};
        int ep = ep(nums, target);
        return new int[]{sp, ep};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna