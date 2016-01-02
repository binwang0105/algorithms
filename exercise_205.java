
public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 && t.length() == 0)
            return true;
        
        if(s.length() != t.length())
            return false;
        
        char[] sc = new char[s.length()];
        char[] tc = new char[t.length()];
        int[] re1 = new int[sc.length];
        int[] re2 = new int[tc.length];
        
        sc = s.toCharArray();
        tc = t.toCharArray();
        
        re1[sc.length-1] = 1;
        
        for(int i = 0; i <= sc.length-2; i++){
            if(sc[i] < sc[i+1])
                re1[i] = -1;
            else if(sc[i] == sc[i+1])
                re1[i] = 0;
            else
                re1[i] = 1;
        }
        
        re2[tc.length-1] = 1;
        for(int j = 0; j <= tc.length-2; j++){
            if(tc[j] < tc[j+1])
                re2[j] = -1;
            else if(tc[j] == tc[j+1])
                re2[j] = 0;
            else
                re2[j] = 1;
        }
        
        for(int k = 0; k < sc.length; k++){
            if(re1[k] != re2[k])
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args){
    	System.out.println(isIsomorphic("ab", "ca"));
    }
}