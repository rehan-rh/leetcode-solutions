class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int inDegree[] = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i= 0 ; i<n ; i++) adj.add(new ArrayList<>());
        Queue<Integer> q = new ArrayDeque<>();
        for(int arr[] : prerequisites)
        {
            int a = arr[0];
            int b = arr[1];
            adj.get(b).add(a);
            inDegree[a]++;
        }
        for(int i=0 ; i<n ; i++) 
        {
            if(inDegree[i]==0) q.offer(i);
        }
        int c = 0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            c++;
            for(int v : adj.get(u))
            {
                inDegree[v]--;
                if(inDegree[v]==0)
                q.offer(v);
            }
        }
        return c==n;
    }
}