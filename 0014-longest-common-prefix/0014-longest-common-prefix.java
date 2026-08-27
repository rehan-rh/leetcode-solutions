class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        if(n==1) return strs[0];
        String s1 = strs[0];
        String s2 = strs[n-1];
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<s1.length() && i<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else
            break;
            i++;
        }
        return sb.toString();
    }
}