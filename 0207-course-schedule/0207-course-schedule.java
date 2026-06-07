class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses ; i++)
        {
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int ar[] : prerequisites)
        {
            int a = ar[1];
            int b = ar[0];
            adj.get(a).add(b);
            indegree[b]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0 ; i<numCourses ; i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
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
                {
                    q.offer(v);
                }
            }
        }
        return c==numCourses;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna