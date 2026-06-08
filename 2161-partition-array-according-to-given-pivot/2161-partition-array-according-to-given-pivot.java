class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        for(int e : nums)
        {
            if(e<pivot)
            {
                smaller.add(e);
            }
            else if(e==pivot)
            {
                equal.add(e);
            }
            else
            {
                larger.add(e);
            }
        }

        int res[] = new int[nums.length];
        int ind = 0;
        while(!smaller.isEmpty())
        {
            res[ind++] = smaller.get(0);
            smaller.remove(0);
        }

        while(!equal.isEmpty())
        {
            res[ind++] = equal.get(0);
            equal.remove(0);
        }

        while(!larger.isEmpty())
        {
            res[ind++] = larger.get(0);
            larger.remove(0);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna