public class Solution {
    private class WeightedUnionFind{
        HashMap<Integer, Integer> parent;
        HashMap<Integer, Integer> size;
        int count;

        public WeightedUnionFind(){
            parent = new HashMap<Integer, Integer>();
            size = new HashMap<Integer, Integer>();
            count = 0;
        }

        public Integer find(Integer index){
            if(!parent.containsKey(index)) return null;

            Integer root = index;
            while(root != parent.get(root)){
                root = parent.get(root);
            }
            while(index != root){
                Integer next = parent.get(index);
                parent.put(index, root);
                index = next;
            }
            return root;
        }

        public void union(Integer a, Integer b){
            Integer aRoot = find(a);
            Integer bRoot = find(b);
            if(aRoot == null || bRoot == null) return;
            if(aRoot.equals(bRoot)) return;

            int aSize = size.get(aRoot);
            int bSize = size.get(bRoot);

            if(aSize > bSize){
                parent.put(bRoot, aRoot);
                size.put(aRoot, aSize + bSize);
            } else {
                parent.put(aRoot, bRoot);
                size.put(bRoot, aSize + bSize);
            }
            count --;
        }

        public void add(Integer index){
            if(!parent.containsKey(index)){
                parent.put(index, index);
                size.put(index, 1);
                count ++;
            }
        }

        public int getCount(){
            return this.count;
        }

    }



    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> list = new ArrayList<Integer>();
        if(positions == null || positions.length == 0) return list;
        WeightedUnionFind uf = new WeightedUnionFind();

        for(int i = 0; i < positions.length; i++){
            int x = positions[i][0];
            int y = positions[i][1];
            int index = x * n + y;

            uf.add(index);

            if(x + 1 <= m - 1)   uf.union(index, (x + 1) * n + y);
            if(x > 0)            uf.union(index, (x - 1) * n + y);
            if(y + 1 <= n - 1)   uf.union(index, x * n + y + 1);
            if(y > 0)            uf.union(index, x * n + y - 1);

            list.add(uf.getCount());
        }

        return list;
    }

}