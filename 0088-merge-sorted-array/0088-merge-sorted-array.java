class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = n-1;
        int i = m-1;
        int k = n+m-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0)
        {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna