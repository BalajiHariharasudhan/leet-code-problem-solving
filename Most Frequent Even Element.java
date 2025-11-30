/*
Leetcode:Most Frequent Even Element
*/
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr=new int[100001];
        for(int x:nums){
            if(x%2==0){
                arr[x]++;
            }
        }
        int fre=0,ind=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>fre){
                fre=arr[i];
                ind=i;
            }
        }
        return ind;
    }
}
