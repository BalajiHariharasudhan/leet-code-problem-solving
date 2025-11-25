/*
Leetcode: Find Indices of Stable Mountains
*/
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                res.add(i);
            }
        }
        return res;
    }
}
