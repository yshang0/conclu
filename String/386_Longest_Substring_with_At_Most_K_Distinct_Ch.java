//386_Longest_Substring_with_At_Most_K_Distinct_Characters

public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int[] cnt = new int[128];
    
    int count = 0;
    int max = 0;
    
    for (int l = 0, r = 0; r < s.length(); r++) {
        cnt[s.charAt(r)]++;
        
        if (cnt[s.charAt(r)] == 1) {
            count++;
            
        }
        
        if (count <= k) {
            max = Math.max(max, r - l + 1);
        }
        
        while (count > k) {
            cnt[s.charAt(l)]--;
            if (cnt[s.charAt(l)] == 0) {
                count--;
            }
            l++;
        }
    }
    return max;
    
}
//time :O(n);
//space:O(1);