//891_Valid_Palindrome_II

public boolean validPalindrome(String s) {
    int i = -1;
    int j = s.length();
    
    while (++i < --j) {
        if (s.charAt(i) != s.charAt(j)) {
            return p(s.substring(i, j)) || p(s.substring(i + 1, j + 1));
        }
    }
    return true;
}

public boolean p (String s) {
    int i = -1;
    int j = s.length();
    while (++i < --j) {
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
    }
    return true;
}

    //time :O(n);
    //space:O(n);