//618_Search_Graph_Nodes


class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { 
 *         label = x; neighbors = new ArrayList<UndirectedGraphNode>(); 
 *     }
 * }

public UndirectedGraphNode searchNode(ArrayList<UndirectedGraphNode> graph,
                                          Map<UndirectedGraphNode, Integer> values,
                                          UndirectedGraphNode node,
                                          int target) {
    Queue<UndirectedGraphNode> q = new LinkedList<>();
    Set<UndirectedGraphNode> v = new HashSet<>();
    q.offer(node);
    v.add(node);
    int level = 0;
    while (q.size() != 0) {
        level++;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            UndirectedGraphNode cur = q.poll();
            if (values.get(cur) == target) {
                return cur;
            }    
            
            for (UndirectedGraphNode n : cur.neighbors) {
                if (!v.contains(n)) {
                    q.offer(n);
                    v.add(n);
                }
            }
        }
    }
    return null;
}
//time :O(m); m is edges
//space:O(n); n is nodes