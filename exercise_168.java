public class Solution {
    public String convertToTitle(int n) {
        StringBuilder stb = new StringBuilder();
        while(n > 0){
            n--;
            stb.append((char)('A' + n % 26));
            n = n/26;
        }
        return stb.reverse().toString();
    }
}


/*1. �����ֱ䳤��String��Ҫ��StringBuilder class
  2. 
*/
