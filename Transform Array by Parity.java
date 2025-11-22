/*
Leetcode:Transform Array by Parity
*/
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        int front=0,rear=nums.length-1;
        while(front<rear){
            while(front<rear && nums[front]==0){
                front++;
            }
            while(front<rear && nums[rear]==1){
                rear--;
            }
            int temp=nums[front];
            nums[front]=nums[rear];
            nums[rear]=temp;
        }
        return nums;
    }
}
