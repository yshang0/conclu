//415_Valid_Palindrome

public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    String s_low = s.toLowerCase();
    int left = 0;
    int right = s_low.length() - 1;
    
    while (left < right) {
        while (left < right && !Character.isLetterOrDigit(s_low.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s_low.charAt(right))) {
            right--;
        }
        char l = s_low.charAt(left);
        char r = s_low.charAt(right);
        if (left < right && l != r) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

    //time:O(n);
    //spacce :O(n);
