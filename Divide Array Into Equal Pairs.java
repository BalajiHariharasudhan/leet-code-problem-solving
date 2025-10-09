/*
Leetcode: Divide Array Into Equal Pairs
Leetcode Id:https://leetcode.com/problems/divide-array-into-equal-pairs/
*/
class Solution {
    public boolean divideArray(int[] nums) {
        int len=nums.length;
        int flag=0;
        if(len%2!=0){
            return false;
        }
        else{
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i+=2){
                if(nums[i]!=nums[i+1]){
                    flag=1;
                    return false;
                }
            }
        }
        if(flag==0){
            return true;
        }
        return true;
    }
}
