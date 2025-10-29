/*
Leetcode:Binary Gap
*/
class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                int ind=arr[i];
                int max=0;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]=='1'){
                        max++;
                        if(max>count){
                            count=max;
                        }
                        break;
                    }
                    max++;
                }
            }
        }
        return count;
    }
}
