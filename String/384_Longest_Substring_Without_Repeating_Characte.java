//384_Longest_Substring_Without_Repeating_Characters

public int lengthOfLongestSubstring(String s) {
    int[] met = new int[257];
    int count = 0;
    int max = 0;
    
    for (int l = 0, r = 0; r < s.length(); r++) {
        char right = s.charAt(r);
        met[right]++;
        if (met[right] == 1) {
            count++;
            max = Math.max (max, count);
        } else {
            while (met[right] != 1) {
                char left = s.charAt(l++);
                met[left]--;
                if (met[left] == 0) {
                    count--;
                } 
            }
        }
    }
    return max;
}
//time :O(n);
//space:O(1);

public int lengthOfLongestSubstring(String s) {
    int[] cnt = new int[128];
    int res = 0;
    
    for (int l = 0, r = 0; r < s.length(); r++) {
        cnt[s.charAt(r)]++;
        
        while (cnt[s.charAt(r)] > 1) {
            cnt[s.charAt(l)]--;
            l++;
        }
        res = Math.max(res, r - l + 1);
    }
    return res;
}