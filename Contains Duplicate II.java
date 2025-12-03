/*
Leetcode: Contains Duplicate II
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> li=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(li.containsKey(val) && i-li.get(val)<=k){
                return true;
            }
            li.put(val,i);
        }
        return false;
    }
}
