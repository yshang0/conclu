//120_Word_Ladder

public int ladderLength(String start, String end, Set<String> dict) {
    Queue<String> q = new LinkedList<>();
    Set<String> v = new HashSet<>();
    
    q.offer(start);
    v.add(start);
    
    int level = 1;
    
    if (start.equals(end)) {
        return level;
    }
    
    while (q.size() != 0) {
        level++;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            String w = q.poll();
            
            for (int j = 0; j < w.length(); j++) {
                for (char k = 'a'; k <= 'z'; k++) {
                    char[] w_ch = w.toCharArray();
                    w_ch[j] = k;
                    String next = String.valueOf(w_ch);
                    
                    if (next.equals(end)) {
                        return level;
                    }
                    if (dict.contains(next) && !v.contains(next)) {
                        q.offer(next);
                        v.add(next);
                    }
                }
            }
        }
    }
    return -1;
}

    //time:O(n * length * 24);
    //space:(n);   n of dict size;

