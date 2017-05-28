public class Solution {
    private class WeightedUnionFind{
        HashMap<Integer, Integer> parent;
        HashMap<Integer, Integer> size;
        int count;

        public WeightedUnionFind(){}
        public WeightedUnionFind(int n){
            parent = new HashMap<Integer, Integer>();
            size = new HashMap<Integer, Integer>();
            count = n;
            for(int i = 0; i < n; i++){
                parent.put(i, i);
                size.put(i, 1);
            }
        }

        public Integer find(Integer node){
            if(!parent.containsKey(node)) return null;

            Integer root = node;
            while(root != parent.get(root)){
                root = parent.get(root);
            }
            while(node != root){
                Integer next = parent.get(node);
                parent.put(node, root);
                node = next;
            }

            return root;
        }

        public void union(Integer p, Integer q){
            Integer pRoot = find(p);
            Integer qRoot = find(q);
            if(pRoot == null || qRoot == null) return;
            if(pRoot.equals(qRoot)) return;

            int pSize = size.get(pRoot);
            int qSize = size.get(qRoot);

            if(pSize > qSize){
                parent.put(qRoot, pRoot);
                size.put(pRoot, pSize + qSize);
            } else {
                parent.put(pRoot, qRoot);
                size.put(qRoot, pSize + qSize);
            }
            count --;
        }

        public int getCount(){
            return this.count;
        }

    }
    public int countComponents(int n, int[][] edges) {
        if(edges == null || edges.length == 0) return n;
        WeightedUnionFind uf = new WeightedUnionFind(n);

        for(int i = 0; i < edges.length; i++){
            int node1 = edges[i][0];
            int node2 = edges[i][1];

            uf.union(node1, node2);
        }

        return uf.getCount();
    }
}
