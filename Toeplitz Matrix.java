/*
Leetcode:Toeplitz Matrix
Leetcode Id:https://leetcode.com/problems/toeplitz-matrix/
*/
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int flag=0;
        for(int row=0;row<r-1;row++){
            for(int col=0;col<c-1;col++){
                if(matrix[row][col]!=matrix[row+1][col+1]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            return true;
        }else{
            return false;
        }
    }
}
