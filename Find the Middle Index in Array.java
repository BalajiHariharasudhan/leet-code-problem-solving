/*
Leetcode:Find the Middle Index in Array
*/
class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ls=Integer.MIN_VALUE;   
            int rs=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                ls+=nums[j];
            }
            if(i==nums.length){
                rs=0;
            }
            else{
            for(int k=i+1;k<nums.length;k++){
                rs+=nums[k];
            }
            }
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}
