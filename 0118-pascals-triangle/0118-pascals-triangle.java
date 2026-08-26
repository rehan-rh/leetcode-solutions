class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ml = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            List<Integer> al = new ArrayList<>();
            for(int j=0 ; j<=i ; j++)
            {
                if(j==0 || j==i) 
                al.add(1);
                else
                {
                    al.add(ml.get(i-1).get(j-1)+ml.get(i-1).get(j));
                }
            }
            ml.add(al);
        }
        return ml;
    }
}