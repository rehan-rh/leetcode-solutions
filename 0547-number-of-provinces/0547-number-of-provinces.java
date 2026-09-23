class Solution {
    void dfs(int s, List<List<Integer>> adj, int vis[])
    {
        vis[s] = 1;
        for(int v : adj.get(s))
        {
            if(vis[v]==0)
            dfs(v, adj, vis);
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
                dfs(i, adj, vis);
            }
        }
        return c;
    }
}