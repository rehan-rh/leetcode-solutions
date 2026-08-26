class Solution {
    void reverse(int l ,int h, int nums[])
    {
        while(l<h)
        {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i=n-1 ; i>=1 ; i--)
        {
            if(nums[i-1]<nums[i]) 
            {
                ind = i-1;
                break;
            }
        }
        if(ind!=-1)
        {
            for(int i=n-1 ; i>=0 ; i--)
            {
                if(nums[i]>nums[ind])
                {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
        }
        reverse(ind+1, n-1, nums);
    }
}