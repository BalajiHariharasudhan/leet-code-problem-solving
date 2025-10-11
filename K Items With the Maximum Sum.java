/*
Leetcode:2600. K Items With the Maximum Sum
Leetcode Id:https://leetcode.com/problems/k-items-with-the-maximum-sum/
*/
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int c=0,res=0;
          for(int i=1;i<=numOnes;i++){
            c+=1;
            res+=1;
            if(c==k){
                return res;
            }
          }
          if(c!=k){
            for(int i=1;i<=numZeros;i++){
                c+=1;
                res+=0;
                if(c==k){
                    return res;
                }
            }
          }
          if(c!=k){
            for(int i=1;i<=numNegOnes;i++){
                c+=1;
                res-=1;
                if(c==k){
                    return res;
                }
            }
          }
          return 0;
    }
}
