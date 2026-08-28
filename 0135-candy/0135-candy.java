class Solution {
    public int candy(int[] ratings) {
        int res = 1;
        int i = 1;
        int n = ratings.length;
        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                res += 1;
                i++;
                continue;
            }
            int peak = 1;
            while(i<n && ratings[i]>ratings[i-1])
            {
                peak += 1;
                res += peak;
                i++;
            }
            int down = 0;
            while(i<n && ratings[i]<ratings[i-1])
            {
                down += 1;
                res += down;
                i++;
            }
            if(peak<=down)
            {
                res += down-peak+1;
            }
        }
        return res;
    }
}