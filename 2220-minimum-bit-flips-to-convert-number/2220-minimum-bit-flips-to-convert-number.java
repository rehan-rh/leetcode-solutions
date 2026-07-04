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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna