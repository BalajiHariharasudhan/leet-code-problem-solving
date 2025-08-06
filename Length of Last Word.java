/*
Leetcode problem:58. Length of Last Word
Leetcode Id:https://leetcode.com/problems/length-of-last-word/
*/
class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        int st=0;
        for(int i=word.length-1;i<=word.length-1;i++){
            st= word[i].length();
        }
        return st;
            
        }
    }
