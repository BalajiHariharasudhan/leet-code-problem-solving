/*
Leetcodde:Next Greater Element I
*/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ind=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ind=j;
                    System.out.print(ind+" ");
                    break;
                }
            }
            if(ind==nums2.length-1){
                arr[i]=-1;
            }
            else{
                int temp=ind;
            for(int k=ind+1;k<nums2.length;k++){
                if(nums2[k]>nums2[temp]){
                    arr[i]=nums2[k];
                    break;
                }
                else{
                    arr[i]=-1;
                }
            }
            }
        }
        return arr;
    }
}
