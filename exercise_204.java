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

// ѭ����2��ʼ����Ϊ0��1������������
// ���iΪ������i+i,i+i+i,i+i+i+i�϶������Ǹ���

