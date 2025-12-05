/*
Leetcode:Check if One String Swap Can Make Strings Equal
*/
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=0;
        if(s1.equals(s2)){
            return true;
        }
        int k=-1,j=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                n++;
                if(k==-1){
                    k=i;
                }
                else if(j==-1){
                    j=i;
                }
            }
        }
        if(n==2){
            if(s1.charAt(k)==s2.charAt(j) && s1.charAt(j)==s2.charAt(k)){
                return true;
            }
        }
        return false;
    }
}
