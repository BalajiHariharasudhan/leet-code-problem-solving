/*
Leetcode :202. Happy Number
Leetcode Id:https://leetcode.com/problems/happy-number/
*/
class Solution {
    public boolean isHappy(int n) {
       if(n==1 || n==7) return true;
       else if(n<10) return false;
       else{
        int sum=0;
        while(n!=0){
            int dig=n%10;
            sum+=dig*dig;
            n/=10;
        }
        return isHappy(sum);
       }
    }
}
