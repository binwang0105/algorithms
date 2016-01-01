public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //using sliding window, length is k
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k)
                set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))
                return true;
        }
        return false;   
    }
}

// set is used to deal with such duplicate problem