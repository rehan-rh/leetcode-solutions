class Solution {
    void f(int l, int h, int nums[])
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
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        f(0, n-1, nums);
        f(0, k-1, nums);
        f(k, n-1, nums);
    }
}