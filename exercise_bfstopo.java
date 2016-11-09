public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
           ArrayList<DirectedGraphNode> list = new ArrayList<DirectedGraphNode>();
           HashMap<DirectedGraphNode, Integer> map = new HashMap<>();
           
           for(DirectedGraphNode node:graph){
               if(!map.containsKey(node)){
                   map.put(node, 1);
               } else {
                   map.put(node, map.get(node) + 1);
               }
           }
           
           Queue<DirectedGraphNode> queue = new LinkedList<>();
           
           for(DirectedGraphNode node:graph){
               if(!map.containsKey(node)){
                    list.add(node);
                    queue.offer(node);
               }
           }
           
           while(!queue.isEmpty()){
               DirectedGraphNode node = queue.poll();
               for(DirectedGraphNode neighbor:node.neighbors){
                   map.put(neighbor, map.get(neighbor) - 1);
                   if(map.get(neighbor) == 0){
                       list.add(neighbor);
                       queue.offer(neighbor);
                   }
               }
           }
           
           return list;
    }
}