/*
Leetcode:Row With Maximum Ones
*/
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[] arr=new int[2];
        int max=0;
        int ind=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ind=i;
            }
        }
        arr[0]=ind;
        arr[1]=max;
        return arr;
    }
}
