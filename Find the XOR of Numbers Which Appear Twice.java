/*
Leetcode:3158. Find the XOR of Numbers Which Appear Twice
Leetcode ID:https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/
*/
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums [i+1]){
                xor=xor^nums[i];
                i++;
            }
        }
        return xor;
    }
}
