class Solution {
    int[] pmin(int a[])
    {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            while(!stack.isEmpty() && a[stack.peek()]>a[i])
            {
                stack.pop();
            }
            res[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }
    int[] nmin(int a[])
    {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];
        for(int i=n-1 ; i>=0 ; i--)
        {
            while(!stack.isEmpty() && a[stack.peek()]>=a[i])
            {
                stack.pop();
            }
            res[i] = stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return res;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int pmin[] = pmin(arr);
        int nmin[] = nmin(arr);
        int mod = (int)1e9+7;
        long res = 0;
        for(int i=0 ; i<n ; i++)
        {
            long pi = i-pmin[i];
            long ni = nmin[i]-i;
            long contribution = (arr[i]*pi*ni)%mod;
            res = (res+contribution)%mod;
        }
        return (int)res%mod;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna