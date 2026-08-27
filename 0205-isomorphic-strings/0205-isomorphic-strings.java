class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        if(s.length()!=t.length()) return false;
        int n = s.length();
        for(int i=0 ; i<n ; i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(m1.containsKey(c1) && m1.get(c1)!=c2) return false;
            else m1.put(c1, c2);

            if(m2.containsKey(c2) && m2.get(c2)!=c1) return false;
            else m2.put(c2, c1);
        }
        return true;
    }
}