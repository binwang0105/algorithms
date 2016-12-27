public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        //如何找到所有除数? for loop
        for(int i = l/2; i > 0; i--){
            if(l % i == 0){
                String sub = str.substring(0, i);
                int times = l/i;
                StringBuilder stb = new StringBuilder();
                for(int j = 0; j < times; j++){
                    stb.append(sub);
                }
                if(stb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}
