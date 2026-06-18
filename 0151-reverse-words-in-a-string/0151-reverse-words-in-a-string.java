class Solution {
    void reverse(int l, int h, char[] a)
    {
        while(l<h)
        {
            char temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
    }
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        char sa[] = s.toCharArray();
        int n = s.length();
        int start = 0;
        for(int end=0 ; end<n ; end++)
        {
            if(sa[end]==' ')
            {
                reverse(start, end-1, sa);
                start = end+1;
            }
        }
        reverse(start, n-1, sa);
        reverse(0, n-1, sa);
        s = new String(sa);
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna