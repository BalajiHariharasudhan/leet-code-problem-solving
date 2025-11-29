/*
Leetcode:Shortest Distance to Target String in a Circular Array
*/
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                int oppDist = n - dist;
                ans = Math.min(ans, Math.min(dist, oppDist));
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
