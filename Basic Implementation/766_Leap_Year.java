//766_Leap_Year
public class Solution {
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public boolean isLeapYear(int n) {
        if(n % 4 == 0) {
            if(n % 400 == 0) {
                return true;
            }
            if(n % 100 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    //A leap year is a calendar year containing one additional day.
    //if a year is divisible by 4 and not divisible by 100 
    //or divisible by 400,
    //it is a leap year. 
}
