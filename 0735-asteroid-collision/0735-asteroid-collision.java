class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int e:asteroids)
        {
            if(e>0) stack.push(e);
            else
            {
                int ne = Math.abs(e);
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<ne)
                {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()>0 && stack.peek()==ne)
                {
                    stack.pop();
                    continue;
                }
                if(stack.isEmpty() || stack.peek()<0)
                stack.push(e);
            }
        }
        int n = stack.size();
        int res[] = new int[n];
        for(int i=n-1 ; i>=0 ; i--)
        {
            res[i] = stack.pop();
        }
        return res;
    }
}