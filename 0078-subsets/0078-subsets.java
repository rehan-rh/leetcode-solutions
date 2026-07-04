class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ml = new ArrayList<>();
        int n = nums.length;
        for(int num=0 ; num<(1<<n) ; num++)
        {
            List<Integer> al = new ArrayList<>();
            for(int i=0 ; i<n ; i++)
            {
                if((num&(1<<i))!=0)
                {
                    al.add(nums[i]);
                }
            }
            ml.add(al);
        }
        return ml;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna