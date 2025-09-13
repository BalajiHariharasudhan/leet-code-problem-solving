/*
Leetcode:Reverse prefix of a word
Leetcode Id:https://leetcode.com/problems/reverse-prefix-of-word/
*/
class Solution {
    public String reversePrefix(String word, char ch) {
    
        StringBuilder sc=new StringBuilder();
        String ns,ls="";
        int flag=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ns=word.substring(0,i+1);
                sc.append(ns);
                sc.reverse();
                ls=word.substring(i+1);
                flag=1;
                break;   
            }
        
        }
        if(flag==0)
        return word;
    String res=sc.toString();
    String rev=res+ls;
    return rev;
    }
}
