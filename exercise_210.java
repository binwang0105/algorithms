public class Solution {
    //要是有环你的解就不对了
    int  counter;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List[] graph = new ArrayList[numCourses];
        int[] findOrder = new int[numCourses];
        
        //init
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<Integer>();
        }
        
        //init graph and indegree array
        for(int[] num : prerequisites){
            int parent = num[1];
            int child = num[0];
            graph[parent].add(child);
            indegree[child]++;
        }
        
        //start bfs from nodes who indegree == 0
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        
        int index = 0;
        while(!queue.isEmpty()){
            int node = (int)queue.poll();
            findOrder[index++] = node;
            counter++;
            
            for(int i = 0; i < graph[node].size(); i++){
                int next = (int)graph[node].get(i);
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        
        return (counter == numCourses) ? findOrder : new int[0];
    }
}