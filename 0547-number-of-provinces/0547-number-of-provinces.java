class Solution {
    void bfs(List<List<Integer>> adj, int vis[], int s)
    {
        vis[s] = 1;
        for(int u : adj.get(s))
        {
            if(vis[u]!=1)
            {
                bfs(adj, vis, u);
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
            if(vis[i]!=1)
            {
                c++;
                bfs(adj, vis, i);
            }
        }
        return c;
    }
}