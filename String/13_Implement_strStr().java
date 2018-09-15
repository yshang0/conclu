//13_Implement strStr()

public int strStr(String source, String target) {
        int ls = source.length();
        int lt = target.length();
        for (int i = 0; i <= ls - lt; i++) {
            if(source.substring(i, i + lt).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}

public int strStr(String source, String target) {
	if(source == null || target == null){
            return -1;
        }
        for(int i = 0; i <= source.length() - target.length(); i++){
            boolean isEqual = true;
            for(int j = 0; j < target.length(); j++){
                if(source.charAt(i + j) != target.charAt(j)){
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                return i;
            }
        }
        return -1;
    }
}
