class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int p = 0;
        for(int e : prices)
        {
            min = Math.min(min, e);
            p = Math.max(p, e-min);
        }
        return p;
    }
}