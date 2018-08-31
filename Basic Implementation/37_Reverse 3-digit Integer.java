//37. Reverse 3-digit Integer
public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
    	int result = 0;
    	int num = number;
    	while(num / 10 != 0) {
    		result = result * 10 + num % 10;
    		num = num / 10;
    	}
    	result = result * 10 + num;
    	return result;
    }
}
