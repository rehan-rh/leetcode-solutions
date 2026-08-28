class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int ml = 0;
        int mf = 0;
        while(r<n)
        {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1);
            mf = Math.max(mf, map.get(c));
            int len = r-l+1;
            if(len-mf>k)
            {
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            if(r-l+1-mf<=k)
            {
                ml = Math.max(ml, r-l+1);
            }
            r++;
        }
        return ml;
    }
}