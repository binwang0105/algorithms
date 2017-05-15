public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int curCount = 0;
        int j = 0;
        int maxSize = 0;
        int[] hash = new int[256];
        for(int i = 0; i < s.length(); i++){
            while(j < s.length()){
                if(curCount == k && hash[s.charAt(j)] == 0) break;
                if(hash[s.charAt(j)] == 0) curCount ++;
                hash[s.charAt(j++)]++;
            }
            if(j - i > maxSize){
                maxSize = j - i;
            }

            hash[s.charAt(i)]--;
            if(hash[s.charAt(i)] == 0) curCount --;
        }

        return maxSize;
    }
}
