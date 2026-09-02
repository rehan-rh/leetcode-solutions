class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = numCourses;
        for(int i=0 ; i<numCourses ; i++)
        {
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        Queue<Integer> q = new ArrayDeque<>();
        for(int arr[]:prerequisites)
        {
            int a = arr[0];
            int b = arr[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
        for(int i=0 ; i<n ; i++)
        {
            if(indegree[i]==0) q.offer(i);
        }
        int c = 0;
        while(!q.isEmpty())
        {
            int u = q.poll();
            c++;
            for(int v:adj.get(u))
            {
                indegree[v]--;
                if(indegree[v]==0) 
                q.offer(v);
            }
        }
        return c==n;
    }
}