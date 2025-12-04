/*
Leetcode:Check Balanced String
*/
class Solution {
    public boolean isBalanced(String num) {
        int ei=0,oi=0;
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            int n=c-'0';
            if(i%2==0 || i==0){
                ei+=n;
            }
            else{
                oi+=n;
            }
        }
        if(ei==oi){
            return true;
        }
        return false;
    }
}
