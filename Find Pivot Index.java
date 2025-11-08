/*
Leetcode:Find Pivot Index
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int  left=0;
        for(int i=0;i<nums.length;i++){
            if(left==totalsum-left-nums[i]){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
