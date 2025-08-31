/* Leet code:Move zeroes
  Leetcode Id:https://leetcode.com/problems/move-zeroes/
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        int nz=nums.length-k;
        for(int j=nums.length-nz;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
