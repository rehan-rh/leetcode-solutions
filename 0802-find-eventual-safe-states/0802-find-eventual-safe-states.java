class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        for(int i=0 ; i<n ; i++)
        {
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            for(int e : graph[i])
            {
                adj.get(e).add(i);
                indegree[i]++;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0 ; i<n ; i++)
        {
            if(indegree[i] == 0)
            q.offer(i);
        }
        while(!q.isEmpty())
        {
            int u = q.poll();
            al.add(u);
            for(int v : adj.get(u))
            {
                indegree[v]--;
                if(indegree[v]==0) q.offer(v);
            }
        }
        Collections.sort(al);
        return al;
    }
}