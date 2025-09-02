/*
Leetcode :Third Maximum Number
Leetcode Id:https://leetcode.com/problems/third-maximum-number/
*/
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!li.contains(nums[i])){
                li.add(nums[i]);
            }
        }
        int[] arr = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        
        Arrays.sort(arr); 
        int len = arr.length;
        if(len == 1) return arr[0];  
        if(len == 2) return arr[len-1]; 
        return arr[len-3];      
    }
}
