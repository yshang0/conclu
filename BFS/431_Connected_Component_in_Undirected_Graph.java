//431_Connected_Component_in_Undirected_Graph

 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList UndirectedGraphNode>(); }
 * };



public class Solution {
    
    public List<List<Integer>> connectedSet(List<UndirectedGraphNode> nodes) {
        List<List<Integer>> result = new ArrayList<>();
        Set<UndirectedGraphNode> v = new HashSet<>();
        
        for (UndirectedGraphNode node : nodes) {
            if (!v.contains(node)) {
                
                bfs (node, v, result);
            }
        }
        return result;
    }
    
    public void bfs (UndirectedGraphNode node, Set<UndirectedGraphNode> v, List<List<Integer>> result) {
        
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        q.offer(node);
        v.add (node);
        while (q.size() != 0) {
            UndirectedGraphNode cur = q.poll();
            ans.add (cur.label);
            for (UndirectedGraphNode n : cur.neighbors) {
                if (!v.contains(n)) {
                    v.add(n);
                    q.offer(n);
                }
            }
        }
        Collections.sort(ans);
        result.add(ans);
        
    }
     //time:O(m);
    //space:O(n);
}