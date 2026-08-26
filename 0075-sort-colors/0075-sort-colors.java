class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;
            }
        }
    }
}