/* Leetcode :Single Number
  Leetcode Id:https://leetcode.com/problems/single-number/
*/
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int a:nums){
            res=res^a;
        }
        return res;
}
}
