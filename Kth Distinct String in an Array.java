/*
Leetcode : Kth Distinct String in an Array
Leetcode Id:https://leetcode.com/problems/kth-distinct-string-in-an-array/
*/
class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> lis=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    c+=1;
                }
            }
            if(c==1){
                lis.add(arr[i]);
            }
        }
        String[] res=lis.toArray(new String[0]);
        if(res.length>=k){
            return res[k-1];
        }
        else{
            return "";
        }
    }
}
