//171_Anagrams

public List<String> anagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < strs.length; i++) {
        char[] cur = strs[i].toCharArray();
        Arrays.sort(cur);
        String s = String.valueOf(cur);
        map.putIfAbsent(s, new ArrayList<String>());
        map.get(s).add(strs[i]);
    }
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        if (entry.getValue().size() > 1) {
            result.addAll(entry.getValue());
        }
    }
    return result;
}
    //Time:O(length  * n logn) n is the average length of string in strs;
    //space:O(length * n);