public class Solution {
    
    public int countComponents(int n, int[][] edges) {

    //use a hashmap to represent a graph, key is node, value is links
        HashMap<Integer, List<Integer>> graph = new HashMap();
        
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        HashSet<Integer> set = new HashSet();
        
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!set.contains(i)){
                count++;
                DFS(graph, set, i);
            }
        }
        
        return count;
        }
        
        private void DFS(HashMap<Integer, List<Integer>> graph, HashSet<Integer> set, int key){
            set.add(key);
            for(int neighbor:graph.get(key)){
                if(!set.contains(neighbor))
                DFS(graph, set, neighbor);
            }
        }
}