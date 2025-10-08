/*
Leetcode:Longer Contiguous Segments of Ones than Zeros
Leetcode Id:https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
*/
class Solution {
    public boolean checkZeroOnes(String s) {
        int m=0,c=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='1'){
            c++;
            if(c>m){
                m=c;
            }
        }   
        else{
            c=0;
        }
        }
        int m1=0,c1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                c1++;
                if(c1>m1){
                    m1=c1;
                }
            }
            else{
                c1=0;
            }
        }
        return m>m1;
         
    }
}
