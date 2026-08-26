class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int e : nums)
        {
            cs = Math.max(cs+e, e);
            ms = Math.max(ms, cs);
        }
        return ms;
    }
}