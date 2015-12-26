public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        int j = 0;
        int a = 0;
        if(nums.length == 0){ 
        //checking length, avoid null pointer exception
            return list;
        }
        if(nums.length == 1){
            list.add(nums[0]+"");
            return list;
        }
        while(j+1 < nums.length){
            if(nums[j+1]-nums[j] == 1){
                j++;
            }
            else{
                if(j==0){
                    list.add(Integer.toString(nums[j]));
                    j++;
                    i = j;
                    continue;
                }
                else if(j>=1 && nums[j]-nums[j-1]>1){
                    list.add(Integer.toString(nums[j]));
                    j++;
                    i = j;
                    continue;
                }
                else{
                    list.add(nums[i] + "->" + nums[j]);
                    j++;
                    i = j;
                    continue;
                }
            }
        }
        if(nums[i]!=nums[j])
            list.add(nums[i] + "->" + nums[j]);
        else
            list.add(Integer.toString(nums[i]));
        return list;
    }
}

/* 
* List is an abstract class, cannot be instantiated
* 数组小心越界问题，比如访问i-1时候需要判断i>1
* 有0，1个元素时候的base cases
* 先考虑base cases: nums中只有一个元素
*
*/