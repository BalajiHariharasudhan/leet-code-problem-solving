/*
Leetcode:Find the K-Beauty of a Number
*/
class Solution {
    public int divisorSubstrings(int num, int k) {

     String str=Integer.toString(num);
     int count=0,i;
     for(i=0;i<=str.length()-k;i++){

         String s=str.substring(i,k+i);
         int n = Integer.parseInt(s);
         if(n!=0 && num%n==0){
            count++;
        }
     }return count;
    }
}
