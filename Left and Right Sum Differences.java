/*
Leetcode:Left and Right Sum Differences
*/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ls=0;
            int rs=0;
            for(int j=0;j<i;j++){
                ls+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rs+=nums[k];
            }
            arr[i]=Math.abs(ls-rs);
        }
        return arr;
    }
}
