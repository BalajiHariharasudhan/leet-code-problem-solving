/*
Leetcode:Base 7
Leetcode Id:https://leetcode.com/problems/base-7/
*/
class Solution {
    public String convertToBase7(int num) {
        long res=0,pv=1,dig;
        while(num!=0){
        dig=num%7;
        res=dig*pv+res;
        pv=pv*10;
        num/=7;
        }
        String str=String.valueOf(res);
        return str;
    }
}
