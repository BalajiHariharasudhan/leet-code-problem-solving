/*
Leetcode:Average Salary Excluding the Minimum and Maximum Salary
*/
class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;


        for(int num : salary){
            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }

            sum += num;
        }

        return (sum - min - max) / (salary.length - 2.0);
    }
}
