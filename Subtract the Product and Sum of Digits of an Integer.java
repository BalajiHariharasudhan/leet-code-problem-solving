/*
Leetcode:Subtract the Product and Sum of Digits of an Integer
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int res1=0;
        int res2=1;
        while(temp!=0){
            int dig=temp%10;
            res1+=dig;
            res2*=dig;
            temp/=10;
        }
        return res2-res1;
    }
}
