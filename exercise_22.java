public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(list, 0, 0, "", n);
        return list;
    }
    
    public void helper(List<String> list, int l, int r, String cur, int n){
        if(l == n && r == n){
            list.add(cur);
        }
        
        if(l < n){
            helper(list, l + 1, r, cur + "(", n);
        }
        
        if(l > r){
            helper(list, l, r + 1, cur + ")", n);
        }
    }
}