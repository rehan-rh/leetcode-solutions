class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c1 = 0;
        int c2 = 0;
        int el1 = -1;
        int el2 = -2;
        ArrayList<Integer> al = new ArrayList<>();
        for(int e : nums)
        {
            if(e == el1 && el1 != el2)
            {
                c1++;
            }
            else if(e == el2 && el1 != el2)
            {
                c2++;
            }
            else if(c1 == 0)
            {
                el1 = e;
                c1 += 1;
            }
            else if(c2 == 0)
            {
                el2 = e;
                c2 += 1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int e : nums)
        {
            if(e == el1) c1++;
            if(e == el2) c2++;
        }
        if(c1>n/3) al.add(el1);
        if(c2>n/3) al.add(el2);
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna