/*
Leetcode:3270. Find the Key of the Numbers
  */
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String n1=String.format("%04d",num1);
        String n2=String.format("%04d",num2);
        String n3=String.format("%04d",num3);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<4;i++){
            int c1=n1.charAt(i)-'0';
            int c2=n2.charAt(i)-'0';
            int c3=n3.charAt(i)-'0';
            s.append(Math.min(c1,Math.min(c2,c3)));
        }
        return Integer.parseInt(s.toString());
    }
}
