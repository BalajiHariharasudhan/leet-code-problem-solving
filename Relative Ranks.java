/*
Leetcode: Relative Ranks
  */
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr=Arrays.copyOf(score,score.length);
        Arrays.sort(arr);
        int k=0;
        int[] n=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
                n[k]=arr[i];
                k++;
        }
        String[] scores=new String[score.length];
        int len=score.length;
        for(int i=0;i<score.length;i++){
            if(score[i]==arr[len-1]){
                scores[i]="Gold Medal";
            }
            else if(score[i]==arr[len-2]){
                scores[i]="Silver Medal";
            }
            else if(score[i]==arr[len-3]){
                scores[i]="Bronze Medal";
            }
            else{
                int ind=-1;
                for(int j=0;j<n.length;j++){
                    if(score[i]==n[j]){
                        ind=j;
                    }
                }
                String s=String.valueOf(ind+1);
                scores[i]=s;
            }
        }
        return scores;
    }
}
