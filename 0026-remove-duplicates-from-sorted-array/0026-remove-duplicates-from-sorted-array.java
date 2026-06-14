class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=1 ; j<n ; j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna