public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        
        int len = s.length();
        boolean valid = false;
        char[] c = s.toCharArray();
        List<String> list = new ArrayList<String>();
        
        if(len < 2){
            return list;
        }
        
        for(int i = 1; i < len; i++){
            if(c[i-1] == '+' && c[i-1] == c[i]){
                valid = true;
            }
        }
        
        if(!valid){
            return list;
        }
        
        for(int i = 1; i < len; i++){
            if(c[i-1] == '+' && c[i-1] == c[i]){
                list.add(s.substring(0, i-1) + "--" + s.substring(i+1, len));
            }
        }
        return list;
    }
}