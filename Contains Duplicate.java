/*
Leetcode:Contains Duplicate
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> tb=new HashSet<>();
        for(int i:nums){
            tb.add(i);
        }
        if(n>tb.size()){
            return true;
        }
        return false;
    }
}
