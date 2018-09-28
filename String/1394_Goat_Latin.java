//1394_Goat_Latin

public String  toGoatLatin(String S) {
        
    String[] str = S.split(" ");
    StringBuffer result = new StringBuffer();
    String a = "ma";
    
    
    for (int i = 0; i < str.length; i++) {
        a = a + "a";
        String cur = "";
        char ch = str[i].charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            cur = str[i] + a;
        } else {
            cur = str[i].substring(1) + str[i].substring(0,1) + a;
        }
        result.append(cur);
        result.append(" ");
    }
    String res = result.toString().trim();
    return res;
}
//time:O(str.length);
//space:O(s.length);