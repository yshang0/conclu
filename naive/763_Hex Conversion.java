//763. Hex Conversion
public class Solution {
    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
    	if(n == 0) {
    		return "0";
    	}
    	String res = "";
        while(n > 0) { // here n > 0
        	int t = n % k;
        	char c = ' '; // here can not be '';
        	if(t > 9) {
        		c = (char)('A' + (t - 10));
        	} else {
        		c = (char)('0' + t);
        	}
        	res = c + res;
        	n = n / k;
        }
        return res;
    }
}