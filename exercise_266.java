public class Solution {
    public boolean canPermutePalindrome(String s) {
        
        //create set
        Set<Character> set = new HashSet<Character>();
       
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                continue;
            }
            set.add(s.charAt(i));
        }
        
        int size = set.size();
        return (size == 1 || size == 0)? true:false;
    }
}
