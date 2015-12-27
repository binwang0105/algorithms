public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        String sString = new String(java.util.Arrays.sort(sArray));
        String tString = new String(java.util.Arrays.sort(tArray));
        return sString.equals(tString);
    }
}

//String长度使用length()
//String对象可以使用Char Array进行构造
//Arrays.sort可以对数组对象进行排序