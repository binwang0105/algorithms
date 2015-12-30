public class Solution {
    public int strStr(String haystack, String needle) {
        //其实最好的解法应该是KMP算法，我的实现只是挨个遍历：
        if(haystack.length() < needle.length())
            return -1;
        for(int i = 0, j = 0; i < haystack.length(); i++){
           if(i == haystack.indexOf(needle))
                return i;
        }
        return -1;
    }
}