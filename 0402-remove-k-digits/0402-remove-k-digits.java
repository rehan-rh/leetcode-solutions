class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char c : num.toCharArray())
        {
            while(!stack.isEmpty() && k>0 && stack.peek()-'0'>c-'0')
            {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k>0 && !stack.isEmpty())
        {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
        sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }
}