/*
Leetcode:1704. Determine if String Halves Are Alike
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        String a=s.substring(0,len/2);
        int count1=0,count2=0;
        String b=s.substring(len/2,len);
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                count1+=1;
            }
        }
        for(int j=0;j<b.length();j++){
            char ch=b.charAt(j);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                count2+=1;
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
}
