class Solution {
    void bfs(int r, int c, char board[][], int vis[][])
    {
        vis[r][c] = 1;
        int n = board.length;
        int m = board[0].length;
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};
        for(int i=0 ; i<4 ; i++)
        {
            int nr = r + row[i];
            int nc = c + col[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && board[nr][nc]=='O')
            {
                bfs(nr, nc, board, vis);
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
            {
                bfs(0, i, board, vis);
            }

            if(vis[n-1][i]==0 && board[n-1][i]=='O')
            {
                bfs(n-1, i, board, vis);
            }
        }

        for(int i=0 ; i<n ; i++)
        {
            if(vis[i][0]==0 && board[i][0]=='O')
            {
                bfs(i, 0, board, vis);
            }
            if(vis[i][m-1]==0 && board[i][m-1]=='O')
            {
                bfs(i, m-1, board, vis);
            }
        }

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(vis[i][j]!=1)
                {
                    board[i][j] = 'X';
                }
            }
        }
    }
}