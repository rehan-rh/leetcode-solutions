class Solution {
    boolean f(int s, int c, int vis[], int a[][])
    {
        vis[s] = c;
        int nc = c==1?0:1;
        for(int v : a[s])
        {
            if(vis[v]==-1)
            {
                if(!f(v, nc, vis, a)) return false;
            }
            else if(vis[v]==c)
            return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        int vis[] = new int[n];
        Arrays.fill(vis, -1);
        for(int i=0 ; i<n ; i++)
        {
            if(vis[i]==-1)
            if(!f(i, 0, vis, graph)) return false;
        }
        return true;
    }
}