//53_Reverse_Words_in_a_String

public String reverseWords(String s) {
    // use space to split the sentence;
    // add the String array to new StringBuffer from end to start;
    //  toString and trim it;
    
    String[] str = s.split(" ");
    StringBuffer result = new StringBuffer();
    
    for(int i = str.length - 1; i >= 0; i--) {
        if(!str[i].equals("") && !str[i].equals(" ")) {
            result.append(str[i]);
            result.append(" ");
        }
    }
    
    String res = result.toString().trim();
    return res;
}