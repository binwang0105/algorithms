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


/*1. 像这种变长的String就要用StringBuilder class
  2. 
*/
