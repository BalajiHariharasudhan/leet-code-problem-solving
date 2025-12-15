/*
Leetcode:Can Make Arithmetic Progression From Sequence
*/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<arr.length-1;i++){
            if(Math.abs(arr[i+1]-arr[i])!=num){
                return false;
            }
        }
        return true;
    }
}
