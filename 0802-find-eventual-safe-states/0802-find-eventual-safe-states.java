class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int indegree[] = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int a : graph[i])
            {
                adj.get(a).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0 ; i<n ; i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        while(!q.isEmpty())
        {
            int u = q.poll();
            al.add(u);
            for(int v : adj.get(u))
            {
                indegree[v]--;
                if(indegree[v]==0)
                {
                    q.offer(v);
                }
            }
        }
        Collections.sort(al);
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna