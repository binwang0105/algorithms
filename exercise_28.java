public class Solution {
    public int strStr(String haystack, String needle) {
        //��ʵ��õĽⷨӦ����KMP�㷨���ҵ�ʵ��ֻ�ǰ���������
        if(haystack.length() < needle.length())
            return -1;
        for(int i = 0, j = 0; i < haystack.length(); i++){
           if(i == haystack.indexOf(needle))
                return i;
        }
        return -1;
    }
}