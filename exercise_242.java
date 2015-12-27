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

//String����ʹ��length()
//String�������ʹ��Char Array���й���
//Arrays.sort���Զ���������������