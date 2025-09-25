/*
Leetcode:Pascal's Triangle 11
Leetcode Id:https://leetcode.com/problems/pascals-triangle-ii/
*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> pre=arr.get(i-1);
                    row.add(pre.get(j)+pre.get(j-1));
                }
            }
            arr.add(row);
        }
        List<Integer> res=arr.get(rowIndex);
        return res;
    }
}
