class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cand = nums[0];
        int c = 0;
        for(int e : nums)
        {
            if(cand==e)
            {
                c++;
            }
            else
            {
                c--;
                if(c==0)
                {
                    cand = e;
                    c = 1;
                }
            }
        }
        c = 0;
        for(int e:nums)
        {
            if(cand==e)
            {
                c++;
            }
        }
        if(c>n/2) return cand;
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna