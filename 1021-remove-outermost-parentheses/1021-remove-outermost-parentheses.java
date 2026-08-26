class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int d = 0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                d++;
                if(d==1) sb.append("");
                else sb.append(c);
            }
            else
            {
                d--;
                if(d==0) sb.append("");
                else sb.append(c);
            }
        }
        return sb.toString();
    }
}