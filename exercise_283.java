public class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        
        if(nums == null || nums.length == 0)
            return;
        
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
            else{
                zeros++;
            }
        }
        
        for(int k = nums.length - 1; k >= nums.length - zeros; k--){
            nums[k] = 0;
        }
    }
}

//不能拷贝额外的数组，那么只能用替换
//in-place来做，需要用两个指针，一个
//不停的向后扫，找到非零位置，然后和
//前面那个指针交换位置即可。统计0的个数！

//使用两个"指针"x和y，初始令y = 0
//利用x遍历数组nums：
//若nums[x]非0，则交换nums[x]与nums[y]
//并令y+1
//再把末尾的几位全用0代替！