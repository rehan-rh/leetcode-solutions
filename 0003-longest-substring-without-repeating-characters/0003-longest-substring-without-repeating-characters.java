class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int n=s.length();
        int res = 0;
        while(r<n)
        {
            char c = s.charAt(r);
            if(map.containsKey(c))
            {
                if(l<=map.get(c))
                {
                    l = map.get(c)+1;
                }
            }
            map.put(c, r);
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna