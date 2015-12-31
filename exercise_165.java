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
1. “.”和“|”都是转义字符，必须得加"\\";
2. 本题使用到了切割字符串
3. 本题比较不可以使用String的compareTo方法，compareTo中01 < 1，事实上二者应该相等
    因此需要先转化为int之后再去比较
4.  函数名Integer.parseInt
*/