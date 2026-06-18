class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1 ; i>=0 ; i--)
        {
            if((num.charAt(i)-'0')%2==1)
            {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna