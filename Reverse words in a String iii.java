/*
Leetcode:Reverse words in a String iii
Leetcode id:https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String rev="";
        for(String sh:arr){
            String si="";
            for(int i=0;i<sh.length();i++){
                char ch=sh.charAt(i);
                si=ch+si;
            }
            rev=rev+si+" ";
        }
        return rev.trim();

    }
}
