class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int m = 0;
        while(m<=r)
        {
            if(nums[m]==0)
            {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                int temp = nums[r];
                nums[r] = nums[m];
                nums[m] = temp;
                r--;
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna