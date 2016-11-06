public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), res, 0);
        return res;
    }
    
    public void dfs(int[] S, List<Integer> cur, List<List<Integer>> res, int index) {
        
        if (index > S.length) 
            return;
        if(!res.contains(cur))
            res.add(new ArrayList<Integer> (cur));
        //�ж�res�����Ƿ��Ѿ�����cur
        for (int i = index; i < S.length; i++) {
            cur.add(S[i]);
            dfs(S, cur, res, i+1);
            cur.remove(cur.size()-1);
        }
    }
}