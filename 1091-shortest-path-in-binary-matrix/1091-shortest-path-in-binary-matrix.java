class pair
{
    int d;
    int r;
    int c;
    pair(int d, int r, int c)
    {
        this.d = d;
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int n = grid.length;
        int m = grid[0].length;
        int dis[][] = new int[n][m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                dis[i][j] = (int)1e9;
            }
        }

        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(1, 0, 0));
        dis[0][0] = 1;

        while(!q.isEmpty())
        {
            pair p = q.poll();
            int d = p.d;
            int r = p.r;
            int c = p.c;
            for(int i=-1 ; i<=1 ; i++)
            {
                for(int j=-1 ; j<=1 ; j++)
                {
                    int nr = r+i;
                    int nc = c+j;
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0)
                    {
                        if(d+1<dis[nr][nc])
                        {
                            dis[nr][nc] = d+1;
                            q.offer(new pair(d+1, nr, nc));
                        }
                    }
                }
            }
        }
        if(dis[n-1][m-1]==(int)1e9) return -1;
        return dis[n-1][m-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna