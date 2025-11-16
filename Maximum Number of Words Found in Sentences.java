/*
Leetcode:Maximum Number of Words Found in Sentences
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            int count = s.split(" ").length;
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}
