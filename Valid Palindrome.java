/*
Leetcode:. Valid Palindrome
Leetcode Id:https://leetcode.com/problems/valid-palindrome/
*/
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]","");
        int front=0,rear=s.length()-1;
        while(front<rear){
            if(s.charAt(front)!=s.charAt(rear)){
                return false;
            }
            front++;
            rear--;
        }
        return true;

    }
}
