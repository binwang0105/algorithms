public class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int ret = 0;
        int tmp = 0;
        for(int i = 0; i < c.length; i++){
            tmp = (int)c[i] + 1;   //得到个位
            ret = ret * 26 + (int)(tmp - 'A');    //得到之前的位以及个位的和
        }
        return ret;
    }
}

// 高进制转化为低进制