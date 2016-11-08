public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        List<DirectedGraphNode> res = new LinkedList<DirectedGraphNode>();
        HashSet<DirectedGraphNode> visited = new HashSet<DirectedGraphNode>(); //avoid repeated visit
        
        for(DirectedGraphNode node : graph){
            if(!visited.contains(node))
                dfs(res, visited, node);
        }
        
        return new ArrayList<DirectedGraphNode>(res);
    }
    
    private void dfs(LinkedList<DirectedGraphNode> res, HashSet<DirectedGraphNode> visited, DirectedGraphNode node){
        
        visited.add(node);
        
        for(int i = 0; i < node.neighbors.size(); i++){
            neighbor = node.get(i);
            if(!visited.contains(neighbor))
                dfs(res, visited, neighbor);
        }
        
        list.addFirst(node);
        
    }
}