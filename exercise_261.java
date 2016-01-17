public class Solution {
    public boolean validTree(int n, int[][] edges) {
         UnionFind uf = new UnionFind(n);
         for(int i = 0; i < edges.length; i++){
             if(!uf.union(edges[i][0], edges[i][1])){
                return false;
            }
         }
         return uf.count() == 1;
    }
   
 public class UnionFind{
    int ids[];
    int cnt;
    public UnionFind(int size){
        this.ids = new int[size];
        //init union array
        
        for(int i = 0; i < ids.length; i++){
        ids[i] = i;
        }
    
        this.cnt = ids.length;
    }

    public boolean union(int m, int n){
        
        int num1 = ids[m];
        int num2 = ids[n];
        
        //if they not connected, change their parent set
        if(num1 != num2){
            for(int i = 0; i < cnt; i++){
                //change all elements whose ids are num1 to num2
                //so num2 and the elements in num1 set can be connected
                if(ids[i] == num1){
                    ids[i] = num2;
                }
            }
            cnt--;
            // the number of set minus 1
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean connected(int a, int b){
        return ids[a] == ids[b];
    }
    
    public int count(){
        return cnt;
    }
 
 }
}

//http://segmentfault.com/a/1190000003791051