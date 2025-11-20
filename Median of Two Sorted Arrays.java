/*
Leetcode:Median of Two Sorted Arrays
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] arr=new int[len1+len2];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        } 
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }
        int len=arr.length-1;
        System.out.print(arr[0]+" "+arr[len]);
        if(arr.length%2==0){
            int mid1=arr[(arr.length/2)-1];
            int mid2=arr[(arr.length/2)];
            return (double)(mid1+mid2)/2;
        }
        else{
            int r=(int)(0+len)/2;
            return arr[r];
        }
    }
}
