class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int j=0;
        for(int i=0 ; i<n ; i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna