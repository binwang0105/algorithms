public class Solution {
    public int removeElement(int[] nums, int val) {
        int begin = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val)
                begin++;
            nums[begin] = nums[i];
        }
        return ++begin;
    }
}

//remove duplicate, remove an element need two pointers