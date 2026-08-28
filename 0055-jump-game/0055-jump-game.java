class Solution {
    public boolean canJump(int[] nums) {
        int mj = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(i>mj) return false;
            mj = Math.max(mj, i+nums[i]);
        }
        return true;
    }
}