class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int mf = 0;
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int res = 0;
        while(r<n)
        {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1);
            mf = Math.max(mf, map.get(c));
            if(((r-l+1)-mf)>k)
            {
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            if(((r-l+1)-mf)<=k)
            {
                res = Math.max(res, r-l+1);
            }
            r++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna