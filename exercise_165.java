public class Solution {
    public int compareVersion(String version1, String version2) {
        int ret = 0;
        
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");
        
        int i = 0;
        int j = 0;
        int iLength = levels1.length;
        int jLength = levels2.length;
        
        int s1temp = 0;
        int s2temp = 0;
        
        while(i < iLength || j < jLength){
            s1temp = (i <= iLength - 1)? Integer.parseInt(levels1[i++]) : 0;
            s2temp = (j <= jLength - 1)? Integer.parseInt(levels2[j++]) : 0;
            
            if(s1temp == s2temp)
                continue;
            else if(s1temp > s2temp)
                return 1;
            else if(s1temp < s2temp)
                return -1;
        }
        return 0;
    }
}

/*
1. ��.���͡�|������ת���ַ�������ü�"\\";
2. ����ʹ�õ����и��ַ���
3. ����Ƚϲ�����ʹ��String��compareTo������compareTo��01 < 1����ʵ�϶���Ӧ�����
    �����Ҫ��ת��Ϊint֮����ȥ�Ƚ�
4.  ������Integer.parseInt
*/