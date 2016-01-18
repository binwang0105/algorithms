public class Solution {
    public boolean isPowerOfThree(int n) {
        
        //this is border conditions
        if(n <= 0){
            return false;
        }
        
        int remain = 0;
        
        while(n > 1 && remain == 0){
            remain = n % 3;
            if(remain != 0){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}