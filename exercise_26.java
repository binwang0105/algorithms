public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int j=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=nums[j]) 
                ++j;
            nums[j]=nums[i];
        }
    return ++j;
    }
}

// 如果使用A[i+1]往前覆盖A[i]会出现数组越界问题，因此不能出现A[i+1]
//*