class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int r = m-1;
        int t = 0;
        int b = n-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(l<=r && t<=b)
        {
            for(int i=l ; i<=r ; i++)
            {
                al.add(matrix[t][i]);
            }
            t++;
            for(int i=t ; i<=b ; i++)
            {
                al.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r ; i>=l ; i--)
                {
                    al.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b ; i>=t ; i--)
                {
                    al.add(matrix[i][l]);
                }
                l++;
            }
            
        }
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna