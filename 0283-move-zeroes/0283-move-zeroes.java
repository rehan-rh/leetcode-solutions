class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0 ; j<nums.length ; j++)
        {
            if(nums[j]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna