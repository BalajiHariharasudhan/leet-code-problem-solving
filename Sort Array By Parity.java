/*
Leetcode:Sort Array By Parity
*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int front=0,rear=0;front<nums.length;front++){
            if(nums[front]%2==0){
                int temp=nums[front];
                nums[front]=nums[rear];
                nums[rear]=temp;
                rear++;
            }
        }
        return nums;
    }
}
