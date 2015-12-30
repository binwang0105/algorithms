public class Solution {
    public int[] plusOne(int[] digits) {
        int digitSum = 0;
        int jinwei = 0;
        for(int i = digits.length-1; i >= 0; i--){
            digitSum = digits[i] + 1;
            if(digitSum < 10){
                jinwei = 0;
                digits[i] = digitSum;
                return digits;
            }
            jinwei = 1;
            digits[i] = 0;
        }
        
        int[] newRetArray = new int[digits.length+1];
        newRetArray[0] = jinwei;
        for(int i = digits.length-1; i >= 0; i--){
            newRetArray[i+1] = digits[i]; 
        }
        return newRetArray;
    }
}

//n位到n+1位只能再去开一个数组