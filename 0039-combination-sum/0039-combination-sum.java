class Solution {
    void f(int ind, int t, int a[], List<Integer> al, List<List<Integer>> ml)
    {
        if(ind==a.length)
        {
            if(t==0) ml.add(new ArrayList<>(al));
            return;
        }

        if(a[ind]<=t)
        {
            al.add(a[ind]);
            f(ind, t-a[ind], a, al, ml);
            al.remove(al.size()-1);
        }
        f(ind+1, t, a, al, ml);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ml = new ArrayList<>();
        f(0, target, candidates, new ArrayList<>(), ml);
        return ml;
    }
}