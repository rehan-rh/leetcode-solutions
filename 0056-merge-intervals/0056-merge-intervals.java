class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> al = new ArrayList<>();
        for(int a[] : intervals)
        {
            if(a[0]<=end)
            {
                end = Math.max(end, a[1]);
            }
            else
            {
                al.add(new int[]{start, end});
                start = a[0];
                end = a[1];
            }
        }
        al.add(new int[]{start, end});
        return al.toArray(new int[0][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna