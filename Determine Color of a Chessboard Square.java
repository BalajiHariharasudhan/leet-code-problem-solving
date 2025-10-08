/*
Leetcode:
Leetcode Id:https://leetcode.com/problems/determine-color-of-a-chessboard-square/
*/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch=coordinates.charAt(1);
        int a=Character.getNumericValue(ch);
        char ch1=coordinates.charAt(0);
        if(ch1=='a'||ch1=='c'||ch1=='e'||ch1=='g'){
            if(a%2==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(a%2==0){
                return false;
            }
            else{
                return true;
            }
        }
        
    }
}
