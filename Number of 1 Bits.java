/*
Leetcode :Number of 1 Bits
Leetcode Id:https://leetcode.com/problems/number-of-1-bits/
*/
class Solution {
    public int hammingWeight(int n) {
        int pv=1,res=0,rem;
        int count=0;
        while(n!=0){
            rem=n%2;
            if(rem==1){
                count++;
            }
            n/=2;
        }
      
        return count;
    }
}
