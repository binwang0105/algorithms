public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        int sum = 0;
        for(NestedInteger num : nestedList){
            sum += dfs(num, 1);
        }
        return sum;
    }

    private int dfs(NestedInteger nestedInt, int depth){
        if(nestedInt.isInteger()){
            return depth * nestedInt.getInteger();
        } else {
            int sum = 0;
            List<NestedInteger> list = nestedInt.getList();
            for(NestedInteger num : list){
                sum += dfs(num, depth + 1);
            }
            return sum;
        }
    }
}
