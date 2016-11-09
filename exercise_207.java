public class Solution {
    
    int counter;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<Integer>();
        }
        
        //compute in-degree for each node
        for(int[] node : prerequisites){
            int parent = node[1];
            int child = node[0];
            graph[parent].add(child); //construct graph
            indegree[child]++;
        }
        
        //start bfs from nodes who indegree == 0
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        
        //iterate child
        while(!queue.isEmpty()){
            int node = queue.poll();
            counter++;
            
            for(int i = 0; i < graph[node].size(); i++){
                int next = (int)graph[node].get(i); //把他们的入度统统减去1
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        
        return counter == numCourses;
    }
}