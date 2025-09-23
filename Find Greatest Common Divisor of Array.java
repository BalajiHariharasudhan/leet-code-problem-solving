/*
Leetcode :1979. Find Greatest Common Divisor of Array
Leetcode Id:https://leetcode.com/problems/find-greatest-common-divisor-of-array/
*/
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=min;i>=1;i--){
            if(nums[0]%i==0 && nums[nums.length-1]%i==0){
                return i;
            }
        }
    return 0;
    }
}
