//879_Output_Contest_Matches

public String findContestMatch(int n) {
    Deque<String> prev = new ArrayDeque<String>();
    for (int i = 1; i <= n; i++) {
        prev.add(String.valueOf(i));
    }
    Deque<String> cur = new ArrayDeque<String>();
    
    while (prev.size() > 1) {
        int size = prev.size();
        for (int j = 0; j < size / 2; j++) {
            StringBuilder string = new StringBuilder();
            string.append("(");
            string.append(prev.pollFirst());
            string.append(",");
            string.append(prev.pollLast());
            string.append(")");
            cur.add(string.toString());
        }
        if (size % 2 == 1) {
            cur.add(prev.poll());
        }
        Deque<String> temp = cur;
        cur = prev;
        prev = temp;
    }
    return prev.poll();
}
//time:O(nlogn);