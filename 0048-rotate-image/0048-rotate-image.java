class Solution {
    void reverse(int a[])
    {
        int l = 0;
        int h = a.length-1;
        while(l<h)
        {
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            h--;
            l++;
        }
    }
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int a[] : matrix)
        {
            reverse(a);
        }
        
    }
}