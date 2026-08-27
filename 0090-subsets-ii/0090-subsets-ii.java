class Solution {
    void f(int ind, int[] a, List<List<Integer>> ml, List<Integer> al)
    {
        ml.add(new ArrayList<>(al));
        if(ind==a.length) return;
        for(int i=ind ; i<a.length ; i++)
        {
            if(i!=ind && a[i]==a[i-1]) continue;
            al.add(a[i]);
            f(i+1, a, ml, al);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ml = new ArrayList<>();
        f(0, nums, ml, new ArrayList<>());
        return ml;
    }
}