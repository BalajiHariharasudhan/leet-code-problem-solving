/*
Leetcode:Single Number II
*/
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:nums){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }
            else{
                hash.put(i,1);
            }
        }
        for(int i:nums){
            if(hash.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}
