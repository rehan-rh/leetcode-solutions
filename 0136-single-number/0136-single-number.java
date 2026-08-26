class Solution {
    public int singleNumber(int[] nums) {
        int c = 0;
        for(int e : nums)
        {
            c ^= e;
        }
        return c;
    }
}