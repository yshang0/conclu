//136_Palindrome_Partitioning

public List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    helper (s, 0, result, new ArrayList<>());
    return result;
}

public void helper (String s, int idx, List<List<String>> result, List<String> cur) {
    if (idx == s.length()) {
        result.add (new ArrayList<>(cur));
        return;
    }
    for (int i = idx; i < s.length(); i++) {
        String str = s.substring(idx, i + 1);
        if (isP(str)) {
            cur.add(str);
            helper (s, i + 1, result, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
private boolean isP (String str) {
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
    }
    return true;
}
//time:O(2^n)