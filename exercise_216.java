public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rst = new ArrayList<>();

        dfs(rst, new ArrayList<>(), n, k, 0, 1);

        return rst;
    }

    private void dfs(List<List<Integer>> rst, List<Integer> list, int target, int k, int sum, int start){
        if(sum > target || k < 0) return;
        if(sum == target && k == 0){
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = start; i <= 9; i++){
            list.add(i);

            dfs(rst, list, target, k - 1, sum + i, i + 1);

            list.remove(list.size() - 1);
        }
    }
}