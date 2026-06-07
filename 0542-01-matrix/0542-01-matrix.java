class pair
{
    int r;
    int c;
    int d;
    pair(int r, int c, int d)
    {
        this.r = r;
        this.c = c;
        this.d = d;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int dis[][] = new int[n][m];
        int vis[][] = new int[n][m];
        Queue<pair> q = new ArrayDeque<>();
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(mat[i][j]==0)
                {
                    q.offer(new pair(i, j, 0));
                    dis[i][j] = 0;
                    vis[i][j] = 1;
                }
            }
        }

        int row[] = {-1, 0, 1, 0};
        int col[] = {0, 1, 0, -1};

        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int d = p.d;
            for(int i=0 ; i<4 ; i++)
            {
                int nr = r+row[i];
                int nc = c+col[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && mat[nr][nc]==1)
                {
                    vis[nr][nc] = 1;
                    dis[nr][nc] = d+1;
                    q.offer(new pair(nr, nc, d+1));
                }
            }
        }
        return dis;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna