/*
Leetcode : Number of Senior Citizens
  Leetcode Id:https://leetcode.com/problems/number-of-senior-citizens/
*/
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            String n=s.substring(11,13);
            int age=Integer.valueOf(n);
            if(age>60){
                count++;
            }
        }
        return count;
    }
}
