/*
Leetcode:Pascal's Triangle
Leetcode Id:https://leetcode.com/problems/pascals-triangle/
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> pre=res.get(i-1);
                    row.add(pre.get(j)+pre.get(j-1));
                }
            }
            res.add(row);
        }
        return res;
    }
}
