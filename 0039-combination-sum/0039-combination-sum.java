class Solution {
    void f(int ind, int t, int a[], List<List<Integer>> ml, List<Integer> al)
    {
        if(ind==a.length)
        {
            if(t==0)
            {
                ml.add(new ArrayList<>(al));
            }
            return;
        }
        if(a[ind]<=t)
        {
            al.add(a[ind]);
            f(ind, t-a[ind], a, ml, al);
            al.remove(al.size()-1);
        }
        f(ind+1, t, a, ml, al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ml = new ArrayList<>();
        f(0, target, candidates, ml, new ArrayList<>());
        return ml;
    }
}