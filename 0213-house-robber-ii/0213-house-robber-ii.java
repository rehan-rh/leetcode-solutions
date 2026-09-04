class Solution {
    public int f(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int ind=1 ; ind<n ; ind++)
        {
            int p = nums[ind];
            if(ind>1)
            p = nums[ind] + dp[ind-2];
            int np = 0 + dp[ind-1];
            dp[ind] = Math.max(p, np);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int nums1[] = new int[n];
        int nums2[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            if(i!=0) nums1[i] = nums[i];
            if(i!=n-1) nums2[i] = nums[i];
        }
        return Math.max(f(nums1), f(nums2));
    }
}