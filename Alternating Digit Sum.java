/*
Leetcode:Alternating Digit Sum
Leetcode Id:https://leetcode.com/problems/alternating-digit-sum/
*/
class Solution {
    public int alternateDigitSum(int n) {
        int nod=(int)Math.log10(n);
        int pv=(int)Math.pow(10,nod);
        int c=1;
        int res=0;
        while(n!=0){
            int dig=n/pv;
            if(c%2==0){
                int rem=dig-dig*2;
                res+=rem;
                c++;
            }else{
                res+=dig;
                c++;
            }
            n=n%pv;
            pv=pv/10;
        }
        return res;
    }
}
