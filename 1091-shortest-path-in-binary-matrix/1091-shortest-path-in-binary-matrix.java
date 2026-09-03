class pair
{
    int r;
    int c;
    pair(int r, int c)
    {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int dis[][] = new int[n][n];
        for(int a[]:dis) Arrays.fill(a, (int)1e9);
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        Queue<pair> q = new ArrayDeque<>();
        dis[0][0] = 1;
        q.offer(new pair(0, 0));
        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int d = dis[r][c];
            for(int i=-1 ; i<=1 ; i++)
            {
                for(int j=-1 ; j<=1 ; j++)
                {
                    int nr = r+i;
                    int nc = c+j;
                    if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==0)
                    {
                        if(d+1<dis[nr][nc])
                        {
                            dis[nr][nc] = d+1;
                            q.offer(new pair(nr, nc));
                        }
                    }
                }
            }
        }
        return dis[n-1][n-1]==(int)1e9?-1:dis[n-1][n-1];
    }
}