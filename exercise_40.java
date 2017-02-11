public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] candidates, int target, int pos){
        if(target == 0){
            if(!res.contains(list)){
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = pos; i < candidates.length; i++){
            list.add(candidates[i]);
            dfs(res, list, candidates, target-candidates[i], i+1);
            list.remove(list.size()-1);
        }
    }
}