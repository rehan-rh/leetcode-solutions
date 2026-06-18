class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                c++;
                if(c==1)
                {

                }
                else
                {
                    sb.append(ch);
                }
            }
            else
            {
                c--;
                if(c==0)
                {

                }
                else
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna