/*
Leetcode:1346. Check If N and Its Double Exist
  */
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(2*arr[j]==num){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
