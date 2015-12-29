public class Solution {
    public int countPrimes(int n) {
       boolean[] mat = new boolean[n];
       int count = 0;
       for(int i = 2; i < n; i++){
           if(mat[i])
                continue;
            count++;
            for(int j = i; j < n; j = j+i){
                mat[j] = true;
            }
       }
       return count;
    }
}

// 循环从2开始，因为0和1均不属于素数
// 如果i为素数，i+i,i+i+i,i+i+i+i肯定都不是复数

