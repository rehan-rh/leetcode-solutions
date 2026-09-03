class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int n = heights.length;
        for(int i=0 ; i<n ; i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            {
                int h = heights[stack.pop()];
                int ni = i;
                int pi = stack.isEmpty()?-1:stack.peek();
                int l = ni-pi-1;
                res = Math.max(res, l*h);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int h = heights[stack.pop()];
            int ni = n;
            int pi = stack.isEmpty()?-1:stack.peek();
            int l = ni-pi-1;
            res = Math.max(res, l*h);
        }
        return res;
    }
}