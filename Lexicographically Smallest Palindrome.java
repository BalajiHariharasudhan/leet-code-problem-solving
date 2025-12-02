/*
Leetcode:Lexicographically Smallest Palindrome
*/
class Solution {
    public String makeSmallestPalindrome(String s) {
        int front,rear;
        char[] arr=s.toCharArray();
        for(front=0,rear=arr.length-1;front<=rear;front++,rear--){
            if(arr[front]!=arr[rear]){
                int n1=(int) arr[front];
                int n2=(int) arr[rear];
                if(n1<n2){
                    arr[rear]=arr[front];
                }
                else{
                    arr[front]=arr[rear];
                }
            }
        }
        String st=String.valueOf(arr);
        return st;
    }
}
