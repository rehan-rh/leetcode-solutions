class Solution {
    public int maxDepth(String s) {
        int md = 0;
        int d = 0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                d++;
            }
            else if(c==')')
            {
                md = Math.max(md, d);
                d--;
            }
        }
        return md;
    }
}