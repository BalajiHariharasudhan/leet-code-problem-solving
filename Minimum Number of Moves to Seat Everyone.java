/*
Leetcode:2037. Minimum Number of Moves to Seat Everyone
*/

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        int moves=0;
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            moves+=Math.abs(seats[i]-students[i]);
        }
        return moves;
}
}
