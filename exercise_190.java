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

// 1. 只保留最后一位：n & 1
// 2. 每次提取出来右边最低位，然后粘贴到result最低位再把result不断左移即可