/*
Leetcode:Sorting the sentence
LeetcodeId:https://leetcode.com/problems/sorting-the-sentence/
*/
class Solution {
    public String sortSentence(String s) {
       String[] arr=s.split(" ");
       String res="";
       for(int i=1;i<=arr.length;i++){
            char str=(char) (i+'0');
            for(int j=0;j<arr.length;j++){
                char ch=arr[j].charAt(arr[j].length()-1);
                if(ch==str){
                    res=res+arr[j].substring(0,arr[j].length()-1)+" ";
                }
            }
       } 
       return res.trim();
    }
}
