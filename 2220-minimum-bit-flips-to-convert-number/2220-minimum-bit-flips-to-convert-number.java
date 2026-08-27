class Solution {
    public int minBitFlips(int start, int goal) {
        start = start^goal;
        int c = 0;
        while(start>0)
        {
            start = (start&(start-1));
            c++;
        }
        return c;
    }
}