//814_Shortest_Path_in_Undirected_Graph

public int shortestPath(List<UndirectedGraphNode> graph, UndirectedGraphNode A, UndirectedGraphNode B) {
    Queue<UndirectedGraphNode> q = new LinkedList<>();
    Set<UndirectedGraphNode> v = new HashSet<>();
    
    q.offer(A);
    v.add(A);
    int level = 0;
    if (A == B) {
        return level;
    }
    
    while (q.size() != 0) {
        level++;
        int size = q.size();
        
        for (int i = 0; i < size; i++) {
            UndirectedGraphNode cur = q.poll();
            for (UndirectedGraphNode node : cur.neighbors) {
                if (node == B) {
                    return level;
                }
                if (v.add(node)) {
                    q.offer(node);
                } 
            }
        }
    }
    return -1;
}
//time:O(m); edges
//space:O(n);