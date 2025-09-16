/*
Leetcode :Search Insert Position
Leeetcode Id:https://leetcode.com/problems/search-insert-position/
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=0;
        while(j<nums.length && nums[j]<target){
            j++;
        }
        return j;
    }
}
