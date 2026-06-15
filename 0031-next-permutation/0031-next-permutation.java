class Solution {
    void reverse(int l, int h, int nums[])
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
        int n = nums.length;
        int ind = -1;
        for(int i=n-2 ; i>=0 ; i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind = i;
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna