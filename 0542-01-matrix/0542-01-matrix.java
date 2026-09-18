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
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<pair> q = new ArrayDeque<>();
        int vis[][] = new int[n][m];
        int dis[][] = new int[n][m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(mat[i][j]==0)
                {
                    dis[i][j] = 0;
                    vis[i][j] = 1;
                    q.offer(new pair(i, j));
                }
            }
        }
        int row[] = {0, -1, 0, 1};
        int col[] = {-1, 0, 1, 0};
        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            for(int i=0 ; i<=3 ; i++)
            {
                int nr = r + row[i];
                int nc = c + col[i];
                int d = dis[r][c];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]!=1)
                {
                    dis[nr][nc] = d+1;
                    vis[nr][nc] = 1;
                    q.offer(new pair(nr, nc));
                }
            }
        }
        return dis;
    }
}