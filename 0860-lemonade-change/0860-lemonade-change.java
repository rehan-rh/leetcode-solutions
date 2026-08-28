class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;
        int n = bills.length;
        for(int e : bills)
        {
            if(e==5)
            {
                f++;
            }
            else if(e==10)
            {
                if(f>=1)
                {
                    f--;
                    t++;
                }
                else
                {
                    return false;
                }
                
            }
            else
            {
                if(t>=1 && f>=1)
                {
                    t--;
                    f--;
                }
                else if(f>=3)
                {
                    f -= 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}