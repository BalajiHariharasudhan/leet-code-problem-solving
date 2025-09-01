/*
Leetcode:Reverse vowels in a string
Leetcode id:https://leetcode.com/problems/reverse-vowels-of-a-string/
*/
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int front =0;
        int rear=arr.length-1;
        String v="aeiouAEIOU";
        while(front<rear){
            while(front<rear && v.indexOf(arr[front])==-1 ){
                front++;
            }
            while(front<rear && v.indexOf(arr[rear])==-1 ){
                rear--;
            }
            char temp=arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
            front++;
            rear--;
        }
    String si=new String(arr);
    return si;
    }
}
