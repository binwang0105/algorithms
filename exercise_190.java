public class Solution { 
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result = result + (n & 1);
            n = n >>> 1;
                if (i < 31)
                result = result << 1;
        }
        return result;
    }
}

// 1. ֻ�������һλ��n & 1
// 2. ÿ����ȡ�����ұ����λ��Ȼ��ճ����result���λ�ٰ�result�������Ƽ���