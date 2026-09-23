class Solution {
    void f(int ind, List<Integer> al, List<List<Integer>> ml, int a[])
    {
        if(ind==a.length)
        {
            ml.add(new ArrayList<>(al));
            return;
        }
        al.add(a[ind]);
        f(ind+1, al, ml, a);
        al.remove(al.size()-1);
        f(ind+1, al, ml, a);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ml = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        f(0, al, ml, nums);
        return ml;
    }
}