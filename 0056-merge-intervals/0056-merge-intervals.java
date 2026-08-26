class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        List<int[]> ml = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int a[] : intervals)
        {
            if(a[0]<=end)
            {
                end = Math.max(end, a[1]);
            }
            else
            {
                ml.add(new int[]{start, end});
                start = a[0];
                end = a[1];
            }
        }
        ml.add(new int[]{start, end});
        return ml.toArray(new int[0][]);
    }
}