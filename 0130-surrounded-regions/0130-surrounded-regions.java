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
    void dfs(int r, int c, int vis[][], char a[][])
    {
        int n = vis.length;
        int m = vis[0].length;
        vis[r][c] = 1;
        int row[] = {0, -1, 0, 1};
        int col[] = {-1, 0, 1, 0};
        for(int i=0 ; i<4 ; i++)
        {
            int nr = r+row[i];
            int nc = c+col[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && a[nr][nc]=='O')
            {
                dfs(nr, nc, vis, a);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int vis[][] = new int[n][m];
        for(int i=0 ; i<m ; i++)
        {
            if(vis[0][i]==0 && board[0][i]=='O')
            dfs(0, i, vis, board);
        }
        for(int i=0 ; i<n ; i++)
        {
            if(vis[i][m-1]==0 && board[i][m-1]=='O')
            dfs(i, m-1, vis, board);
        }
        for(int i=m-1 ; i>=0 ; i--)
        {
            if(vis[n-1][i]==0 && board[n-1][i]=='O')
            dfs(n-1, i, vis, board);
        }
        for(int i=n-1 ; i>=0 ; i--)
        {
            if(vis[i][0]==0 && board[i][0]=='O')
            dfs(i, 0, vis, board);
        }

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(vis[i][j]==0) board[i][j]='X';
            }
        }
    }
}