leetcode problem:Valid Perfect Square
leetcode Id:https://leetcode.com/problems/valid-perfect-square
class Solution {
    public boolean isPerfectSquare(int num) {
        int res=(int)Math.sqrt(num);
        if(num==(res*res)){
            return true; 
        }
        else{
            return false;
        }
    }
}
