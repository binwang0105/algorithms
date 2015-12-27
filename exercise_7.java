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

//1. 每次使用%算出当前位置上的数字(reversed)
//2. 小心溢出问题，如果溢出后会是一堆乱七八糟的数字
//If overflow exists, the new result will not equal previous one.