public class Solution {
    public String addBinary(String a, String b) {
       
        if(a == null && b != null)
            return b;
        if(a != null && b == null)
            return a;
        
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        StringBuilder stb = new StringBuilder();
       
        int digitSum = 0;
        int carry = 0;
        int aByte;
        int bByte;
        
        int i = c1.length - 1;
        int j = c2.length - 1;
        
        //两个数组长度不一样的处理方法
        while(i > -1 || j > -1 || carry == 1){
            aByte = (i > -1)? Character.getNumericValue(c1[i--]) : 0;
            bByte = (j > -1)? Character.getNumericValue(c2[j--]) : 0;
            digitSum = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(digitSum);
        }
        return stb.reverse().toString();
    }
}

//String.isEmpty()判断字符串是否为空
//digitSum = aByte ^ bByte ^ carry;二进制求和方法
//char to int: Character.getNumericValue(x);
//StringBuilder往里面不断加东西用append方法
//StringBuilder输出时候记住加reverse，否则先进去的会先出来
//在字符串中两个数组长度不一样的处理方法 while(i > -1 || j > -1)