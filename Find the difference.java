/*
Leetcode:Find the difference
Leetcode Id:https://leetcode.com/problems/find-the-difference/
*/
class Solution {
    public char findTheDifference(String s, String t) {
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++){
            int ind=t.charAt(j)-'a';
            fre[ind]--;
            if(fre[ind]<0){
                return t.charAt(j);
            }
        }
        return ' '; 
    }
}
