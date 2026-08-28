class Solution {
    int f(int nums[], int g)
    {
        if(g<0) return 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        int sum = 0;
        int res = 0;
        while(r<n)
        {
            sum += nums[r];
            while(sum>g)
            {
                sum -= nums[l];
                l++;
            }
            if(sum<=g)
            {
                res += r-l+1;
            }
            r++;
        }
        return res;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums, goal)-f(nums, goal-1);
    }
}