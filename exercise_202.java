public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int num = n;
        set.add(num);
        
        while(num != 1){
        int tail = 0;
        int sum = 0;
            while(num != 0){
                sum += Math.pow(num % 10, 2);
                num /= 10;
            }
            if(set.contains(sum))
                return false;
            set.add(sum);
            num = sum;
        }
        return true;
    }
}

// tail = n % 10;
// sum = sum + (tail^2);
// num = num/10;
// Java�в�����ʹ��^2������ƽ����ֻ��ʹ��Math.pow�����ó˷����� 
// set��abstraction������ʹ����implementaion��HashSet
// Java setҲ��contains����
// http://blog.csdn.net/macchan/article/details/46883619