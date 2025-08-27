/*
Leetcode:448 - Find All Numbers Disappeared in an Array
Leetcode link:https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] frequency=new int[nums.length];
        for(int num:nums){
            frequency[num-1]++;
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]==0){
                list.add(i+1);
            }
        }
        return list;
        
    }
}
