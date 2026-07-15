class Solution {
    int f(int nums[], int k)
    {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int n = nums.length;
        while(r<n)
        {
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while(map.size()>k)
            {
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            if(map.size()<=k)
            {
                res += r-l+1;
            }
            r++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums, k)-f(nums, k-1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna