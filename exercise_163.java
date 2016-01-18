public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<String> ranges = new ArrayList<String>();
        
        int prev = lower - 1, curr = 0;
        for(int i = 0 ; i <= nums.length; i++){
            
            //get nums[i] to curr, 多循环两次
            if(i == nums.length){
                curr = upper + 1;
            }
            else{
                curr = nums[i];
            }
            
            //if we have a range
            if(curr - prev > 1){
                ranges.add(getRanges(prev+1, curr-1));
            }
            
            //update prev
            prev = curr;
        }
        
        return ranges;
    }
    
    public String getRanges(int from, int to){
        return from == to? Integer.toString(from):from + "->" + to;
    }
}