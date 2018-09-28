//837_Palindromic_Substrings

int result = 0;
public int countPalindromicSubstrings(String str) {
    if (str == null || str.length() == 0) {
        return 0;
    }   
    
    for (int i = 0; i < str.length(); i++) {
        palidrom(str, i, i);
        palidrom(str, i, i + 1);
    }
    return result;
}

public void palidrom(String s, int i, int j) {
    while (i >= 0 && j <= s.length() - 1 && s.charAt(i) == s.charAt(j)) {
        result++;
        i--;
        j++;
    }
}
//time: O(n ^ 2);
//space:O(n);
