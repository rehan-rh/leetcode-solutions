class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int mj = 0;
        int c = 0;
        while(r<n-1)
        {
            for(int i=l ; i<=r ; i++)
            {
                mj = Math.max(mj, i+nums[i]);
            }
            l = r+1;
            r = mj;
            c++;
        }
        return c;
    }
}