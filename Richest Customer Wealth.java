/*
Leetcode:Richest Customer Wealth
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int max=0;
        for(int i=0;i<row;i++){
            int num=0;
            for(int j=0;j<col;j++){
                num+=accounts[i][j];
            }
            if(num>max){
                max=num;
            }
        }
    return max;
    }
}
