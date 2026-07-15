class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ms = 0;
        int n = cardPoints.length;
        int ls = 0;
        int rs = 0;
        for(int i=0 ; i<k ; i++)
        {
            ls += cardPoints[i];
        }
        ms = ls;
        int ri = n-1;
        for(int i=0 ; i<k ; i++)
        {
            ls -= cardPoints[k-1-i];
            rs += cardPoints[ri];
            ri--;
            ms = Math.max(ms, ls+rs);
        }
        return ms;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna