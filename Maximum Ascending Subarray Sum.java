/*
Leetcode:Maximum Ascending Subarray Sum
*/
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0],sum=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i+1];
            }
            else{
                if(sum>max){
                    max=sum;
                }
                sum=nums[i+1];
            }
        }
        if(sum>max){
            max=sum;
        }
        return max;
    }
}
