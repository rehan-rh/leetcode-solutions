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
        for(int i=k-1 ; i>=0 ; i--)
        {
            ls -= cardPoints[i];
            rs += cardPoints[ri];
            ri--;
            ms = Math.max(ms, ls+rs);
        }
        return ms;
    }
}