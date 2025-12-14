/*
Leetcode: Remove Duplicates from Sorted Array II
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        int occurance=1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]==nums[i-1]){
                occurance += 1;
            }else{
                occurance = 1;
            }
            if (occurance<= 2){ 
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
