/*
Leetcode:Positions of Large Groups
*/
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new ArrayList<>();
        int count=1;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count+=1;
            }
            else{
            if(count>=3){
                List<Integer>i1=new ArrayList<>();
                int ind=(i+1)-count;
                i1.add(ind);
                i1.add(i);
                res.add(i1);
            }
            count=1;
            }
        }
        if(count>=3){
            List<Integer> i1=new ArrayList<>();
            int st=arr.length-count;
            int end=arr.length-1;
            i1.add(st);
            i1.add(end);
            res.add(i1);
        }
        return res;
    }
}
