//415_Valid_Palindrome

public boolean isPalindrome(String s) {
        // write your code here
        
         StringBuffer str = new StringBuffer();
        for(int j = 0; j < s.length(); j++) {
            char a = s.charAt(j);
            if((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9')) {
                str.append(s.charAt(j));
            }
        }

        String a = str.toString();
        String b = a.toUpperCase();
        if(a == null || a.length() == 0 || a.length() == 1) {
            return true;
        }

        for(int i = 0; i <= b.length() / 2; i++) {
            if(b.charAt(i) != b.charAt(b.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public boolean isPalindrome(String s) {
        // write your code here
        
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        
        while(left < right){
            char chLeft = s.charAt(left), chRight = s.charAt(right);
            
            if(!Character.isLetterOrDigit(chLeft)){
                left++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(chRight)){
                right--;
                continue;
            }
            
            if(chLeft != chRight){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}