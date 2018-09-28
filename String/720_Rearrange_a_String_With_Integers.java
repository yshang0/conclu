//720_Rearrange_a_String_With_Integers

public String rearrange(String str) {
    Queue<Character> q = new PriorityQueue<>();
    int num = 0;
    char[] ch = str.toCharArray();
    for (char c : ch) {
        if(Character.isDigit(c)) {
            num += (c - '0');
        } else {
            q.add(c);
        }
    }
    StringBuffer res = new StringBuffer();
    while (!q.isEmpty()) {
        res.append(q.poll());
    }
    res.append(num);
    return res.toString();
}
//time :O(NlogN);
//spce:O(n);

//可以用int[] s = new int[26] 来做；