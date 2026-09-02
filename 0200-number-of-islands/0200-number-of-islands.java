class Solution {
    void dfs(int r, int c, int vis[][], char a[][])
    {
        vis[r][c] = 1;
        int n = vis.length;
        int m = vis[0].length;
        int row[] = {0, -1, 0, 1};
        int col[] = {-1, 0, 1, 0};
        for(int i=0 ; i<4 ; i++)
        {
            int nr = r+row[i];
            int nc = c+col[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && a[nr][nc]=='1')
            {
                dfs(nr, nc, vis, a);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int c = 0;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    c++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        return c;
    }
}