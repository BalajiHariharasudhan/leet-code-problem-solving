/*
Leetcode:Kids With the Greatest Number of Candies
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>(candies.length);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
            if((candies[j]+extraCandies)>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}
