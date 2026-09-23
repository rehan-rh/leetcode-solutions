class Solution {
    void bfs(int s, List<List<Integer>> adj, int vis[])
    {
        Queue<Integer> q = new ArrayDeque<>();
        vis[s] = 1;
        q.offer(s);
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int v : adj.get(u))
            {
                if(vis[v]==0)
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
        for(int i=0 ; i<n ; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[] = new int[n];
        int c = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(vis[i]==0)
            {
                c++;
                bfs(i, adj, vis);
            }
        }
        return c;
    }
}