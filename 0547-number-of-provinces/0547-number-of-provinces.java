class Solution {
    void bfs(int s, List<List<Integer>> adj, int[] vis)
    {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(s);
        vis[s] = 1;
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int v : adj.get(u))
            {
                if(vis[v]!=1)
                {
                    vis[v] = 1;
                    q.offer(v);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        int m = isConnected[0].length;
        for(int i=0 ; i<n ; i++) adj.add(new ArrayList<>());
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                }
            }
        }

        int vis[] = new int[n];
        int c = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(vis[i]!=1)
            {
                bfs(i, adj, vis);
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna