public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        String stringLowerCase = s.toLowerCase();
        char[] c = stringLowerCase.toCharArray();
        int i = 0;
        int j = c.length - 1;
        
        for(int k = 0; k < c.length; k++){
            if(!((c[k]>=0 && c[k]<='9')||(c[k] >= 'a' && c[k] <= 'z')))
                c[k] = ' ';
        }
        
        while(i != j){
           if(c[i]== ' '){
                i++;
                continue;
           }
           if(c[j] == ' '){
                j--;
                continue;
           }
           if(c[i] != c[j])
           {
               return false;
           }
        }
        return true;
    }
}