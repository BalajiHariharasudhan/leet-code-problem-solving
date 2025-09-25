/*
Leetcode:https:Transpose-matrix
Leetcode Id:https://leetcode.com/problems/transpose-matrix/
*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] result=new int[c][r];
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
               result[col][row]=matrix[row][col];
            }
        }
        return result;
    }
}
