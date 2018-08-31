//145_Lowercase_to_Uppercase
public class Solution {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        char ct = (char)(character - 'a' + 'A');
        return ct;
    }
}