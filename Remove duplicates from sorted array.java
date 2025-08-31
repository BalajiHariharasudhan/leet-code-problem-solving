/*Leet code: Remove duplicates from sorted array
  Leet code id:https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                a.add(nums[i]);
            }
        }
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i);
        }
        return a.size();

    }
}
