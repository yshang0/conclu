//178_Graph_Valid_Tree

public boolean validTree(int n, int[][] edges) {
    if (n != (edges.length + 1)) {
        return false;
    }
    HashMap<Integer, Set<Integer>> outdegree = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
        outdegree.put (i, new HashSet<Integer>());
    }
    for (int j = 0; j < edges.length; j++) {
        outdegree.get(edges[j][0]).add(edges[j][1]);
        outdegree.get(edges[j][1]).add(edges[j][0]);
    }
    
    Queue<Integer> q = new LinkedList<>();
    Set<Integer> v = new HashSet<>();
    
    q.offer(0);
    v.add(0);
    
    while (!q.isEmpty()) {
        int cur = q.poll();
        for (int c : outdegree.get(cur)) {
            if (v.contains(c)) {
                continue;
            }
            q.offer(c);
            v.add(c);
        }
    }
    if (v.size() != n) {
        return false;
    } 
    return true;
}