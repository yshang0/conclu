//158_Valid_Anagram

public boolean anagram(String s, String t) {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        
        Arrays.sort(sch);
        Arrays.sort(tch);
        
        String s2 = String.valueOf(sch);
        String t2 = String.valueOf(tch);
        
        if(s2.equals(t2)) {
            return true;
        } else {
            return false;
        }
    }
}

public boolean anagram(String s, String t) {

        int[] cntS = new int[256];
        int[] cntT = new int[256];
        for (char c : s.toCharArray()) {
            cntS[c]++;
        }
        for (char c : t.toCharArray()) {
            cntT[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (cntS[i] != cntT[i]) {
                return false;
            }
        }
        return true;
    }