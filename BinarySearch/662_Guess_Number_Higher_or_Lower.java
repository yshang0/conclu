//662_Guess_Number_Higher_or_Lower
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    /**
     * @param n an integer
     * @return the number you guess
     */
    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(guess(mid) == -1) {
                end = mid;
            }
            if(guess(mid) == 1) {
                start = mid;
            }
            if(guess(mid) == 0) {
                return mid;
            }
        }
        if(guess(start) == 0) {
            return start;
        }
        if(guess(end) == 0) {
            return end;
        }
        return -1;
    }
}