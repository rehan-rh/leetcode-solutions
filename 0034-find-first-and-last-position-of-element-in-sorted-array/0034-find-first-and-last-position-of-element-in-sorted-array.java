class Solution {
    int fo(int nums[], int t)
    {
        int l = 0;
        int h = nums.length-1;
        int fo = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==t)
            {
                fo = mid;
                h = mid-1;
            }
            else if(nums[mid]<t)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return fo;
    }
    int lo(int nums[], int t)
    {
        int l = 0;
        int h = nums.length-1;
        int lo = -1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==t)
            {
                lo = mid;
                l = mid+1;
            }
            else if(nums[mid]<t)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return lo;
    }
    public int[] searchRange(int[] nums, int target) {
        int fo = fo(nums, target);
        if(fo==-1) return new int[]{-1, -1};
        int lo = lo(nums, target);
        return new int[]{fo, lo};
    }
}