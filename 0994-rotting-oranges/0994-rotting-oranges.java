class pair
{
    int r;
    int c;
    int t;
    pair(int r, int c, int t)
    {
        this.r = r;
        this.c = c;
        this.t = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<pair> q = new ArrayDeque<>();
        int vis[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j] = 1;
                    q.offer(new pair(i, j, 0));
                }
            }
        }

        int mt = 0;
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};
        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int t = p.t;
            for(int i=0 ; i<4 ; i++)
            {
                int nr = row[i]+r;
                int nc = col[i]+c;
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]!=1 && grid[nr][nc]==1)
                {
                    vis[nr][nc] = 1;
                    q.offer(new pair(nr, nc, t+1));
                    mt = Math.max(mt, t+1);
                }
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                return -1;
            }
        }
        return mt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna