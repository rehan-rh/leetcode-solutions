class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc = 0;
        int c = 0;
        for(int e : nums)
        {
            if(e==1)
            {
                c++;
            }
            else
            {
                mc = Math.max(mc, c);
                c = 0;
            }
        }
        mc = Math.max(mc, c);
        return mc;
    }
}