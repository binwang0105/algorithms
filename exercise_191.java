public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        if(n == 0)
            return 0;
        while(n != 0){
            ones = ones + (n & 1);
            n >>>= 1;
        }
        return ones;
    }
}

// Int to string
// Int to char[]
// ����ֱ�Ӻ�����һ������&����|������ǰ���λ������е�