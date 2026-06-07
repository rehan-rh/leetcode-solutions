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
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int src = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        if(src == color) return image;
        Queue<pair> q = new ArrayDeque<>();
        image[sr][sc] = color;
        q.offer(new pair(sr, sc));
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};
        while(!q.isEmpty())
        {
            pair p = q.poll();
            int r = p.r;
            int c = p.c;
            for(int i=0 ; i<4 ; i++)
            {
                int nr = r+row[i];
                int nc = c+col[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==src)
                {
                    image[nr][nc] = color;
                    q.offer(new pair(nr, nc));
                }
            }
        }
        return image;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna