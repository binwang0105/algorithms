public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        
        if(slen<tlen)
            return isOneEditDistance(t, s);
        
        if(slen == tlen)
            return isOneModified(s, t);
        
        if(slen - tlen == 1)
            return isOneDeleted(s, t);
        return false;
    }
    
    private boolean isOneModified(String s, String t){
        boolean flag = false;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(flag)
                    return false;
                flag = true;
            }
        }
        return flag;
    }
    
    private boolean isOneDeleted(String s, String t){
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(i+1).equals(t.substring(i));
            }
        }
        return true;
    }
}
//Ê±¼äO(N)¿Õ¼äO(1)