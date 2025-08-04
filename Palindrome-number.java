/*
Leetcode:9. Palindrome Number
Leetcode link:https://leetcode.com/problems/palindrome-number/
*/

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp=x;
        if(temp<0){
            return false;
        }
        while (temp> 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp/=10;
        }
        if (x == rev) {
            return true;
        }
        else{
            return false;
        }
    }
}
