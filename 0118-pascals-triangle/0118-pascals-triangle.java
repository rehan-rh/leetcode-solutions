class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ml = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            List<Integer> al = new ArrayList<>();
            for(int j=0 ; j<=i ; j++)
            {
                if(j==0 || j==i) al.add(1);
                else
                al.add(ml.get(i-1).get(j-1)+ml.get(i-1).get(j));
            }
            ml.add(al);
        }
        return ml;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna