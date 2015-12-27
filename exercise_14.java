public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(pre)!=0){
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}
/* indexOf:
1. int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引。 
int indexOf(int ch, int fromIndex) 从指定的索引开始搜索，返回在此字符串中第一次出现指定字符处的索引。 
2. int indexOf(String str) 返回第一次出现的指定子字符串在此字符串中的索引。 
3. int indexOf(String str, int fromIndex) 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。 
*/

/* substring(int startposition, int endposition)
1. 取从start开始到end截至的子串

method:
1. find the standard
2. compare with others
3. not same, length - 1 and try again
*/