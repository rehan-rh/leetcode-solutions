class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int a[] = new int[256];
        for(int i=0 ; i<s.length() ; i++)
        {
            a[s.charAt(i)]++;
            a[t.charAt(i)]--;
        }
        for(int e : a)
        {
            if(e!=0) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna