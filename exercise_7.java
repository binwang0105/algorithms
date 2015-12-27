public class Solution {
    public int reverse(int x) {
      int result = 0;
      while(x != 0){
          int tail = x % 10;   //unit digit
          int newResult = result*10 + tail;
          if ((newResult - tail) / 10 != result){ 
              return 0; 
          }
          result = newResult;
          x = x / 10;
      }
      return result;
    }
}

//1. ÿ��ʹ��%�����ǰλ���ϵ�����(reversed)
//2. С��������⣬�����������һ�����߰��������
//If overflow exists, the new result will not equal previous one.