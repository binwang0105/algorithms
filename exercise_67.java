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
        
        //�������鳤�Ȳ�һ���Ĵ�����
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

//String.isEmpty()�ж��ַ����Ƿ�Ϊ��
//digitSum = aByte ^ bByte ^ carry;��������ͷ���
//char to int: Character.getNumericValue(x);
//StringBuilder�����治�ϼӶ�����append����
//StringBuilder���ʱ���ס��reverse�������Ƚ�ȥ�Ļ��ȳ���
//���ַ������������鳤�Ȳ�һ���Ĵ����� while(i > -1 || j > -1)