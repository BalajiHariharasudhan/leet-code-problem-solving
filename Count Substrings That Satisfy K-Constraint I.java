/*
Leetcode: Count Substrings That Satisfy K-Constraint I
*/
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int zc=0,oc=0;
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                if(c=='0'){
                    zc++;
                }
                else{
                    oc++;
                }
                if(zc<=k || oc<=k){
                    ans++;
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}
