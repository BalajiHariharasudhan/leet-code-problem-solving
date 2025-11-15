/*
Leetcode:Count Integers With Even Digit Sum
*/
class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(i<=9){
                if(i%2==0){
                    count++;
                }
            }
            else{
                int temp=i;
                int res=0;
                while(temp!=0){
                    int dig=temp%10;
                    res+=dig;
                    temp/=10;
                }
                if(res%2==0){
                    count++;
                }
            }
        }
        return count;
    }
}
