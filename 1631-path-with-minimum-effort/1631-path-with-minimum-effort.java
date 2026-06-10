class pair
{
    int c;
    int r;
    int d;
    pair(int d, int r, int c)
    {
        this.r = r;
        this.c = c;
        this.d = d;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<pair> q = new PriorityQueue<>((a, b)->a.d-b.d);
        int dis[][] = new int[n][m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                dis[i][j] = (int)1e9;
            }
        }
        dis[0][0] = 0;
        q.offer(new pair(0, 0, 0));
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};
        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int d = p.d;
            if(r==n-1 && c==m-1) return d;
            for(int i=0 ; i<4 ; i++)
            {
                int nr = r+row[i];
                int nc = c+col[i];
                
                if(nr>=0 && nr<n && nc>=0 && nc<m)
                {
                    int newEffort = Math.max(d, Math.abs(heights[nr][nc]-heights[r][c]));
                    if(newEffort<dis[nr][nc])
                    {
                        dis[nr][nc] = newEffort;
                        q.offer(new pair(newEffort, nr, nc));
                    }
                    
                }
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna