class Solution {
    public int numberOfSubstrings(String s) {
        int nums[] = new int[3];
        Arrays.fill(nums, -1);
        int res = 0;
        for(int i=0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            nums[c-'a'] = i;
            if(nums[0]!=-1 && nums[1]!=-1 && nums[2]!=-1)
            {
                res += Math.min(nums[0], Math.min(nums[1], nums[2]))+1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna