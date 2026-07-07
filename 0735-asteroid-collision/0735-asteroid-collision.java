class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int e : asteroids)
        {
            if(e>0) 
            {
                stack.push(e);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(e))
                {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()>0 && stack.peek()==Math.abs(e))
                {
                    stack.pop();
                    continue;
                }
                if(!stack.isEmpty() && stack.peek()<0 || stack.isEmpty())
                {
                    stack.push(e);
                }
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna