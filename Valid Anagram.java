/* Leetcode:Valid Anagram
  Leetcode Id:https://leetcode.com/problems/valid-anagram/
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2) return false;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;
        }
    }
}
