/*
Leetcode:Group Anagrams
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        for (int k = 0; k < strs.length; k++) {
            str.add(strs[k]);
        }
        while (!str.isEmpty()) {
            String s = str.get(0);
            int len1 = s.length();
            List<String> inner = new ArrayList<>();
            ArrayList<String> toRemove = new ArrayList<>();
            for (int j = 1; j < str.size(); j++) {
                String st = str.get(j);
                int len2 = st.length();
                if (len1 != len2) continue;
                char[] arr1 = s.toCharArray();
                char[] arr2 = st.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    inner.add(st);
                    toRemove.add(st);        
                    }
            }
            inner.add(s);
            toRemove.add(s);                 
            for (String rm : toRemove) {
                str.remove(rm);
            }
            res.add(inner);
        }
        return res;
    }
}
