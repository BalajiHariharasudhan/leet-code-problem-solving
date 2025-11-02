/*
Leetcode:Find the Distance Value Between Two Arrays
*/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
      int count=0;
      for(int i=0;i<arr1.length;i++){
        int n=0;
        for(int j=0;j<arr2.length;j++){
            if(Math.abs(arr1[i]-arr2[j])<=d){
                n+=1;
                break;
            }
        }
        if(n==0){
            count++;
        }
    }  
    return count;
    }
}
