public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        //用于去重复
        
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(nums == null && nums.length < 3)
            return resultList;
   
        Arrays.sort(nums);
        //先sort一遍
        
        //先确定最外层
        for(int i = 0; i <= nums.length - 2; i++){
            
            int start = i+1;
            int end = nums.length - 1;
            
            //再确定最里层
            while(start < end){
                
                //start和end会发生变化，所以在这里创建list
                List<Integer> list = new ArrayList<Integer>();
                
                int sum = nums[start] + nums[end] + nums[i];
                
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    
                    //如果set里面没有出现过list才最终加入到resultList中去
                    if(set.add(list)){
                        resultList.add(list);
                    }
                    
                    //改变start和end
                    start++;
                    continue;
                }
                else if(sum < 0){
                    start++;
                    continue;
                }
                else if(sum > 0){
                    end--;
                    continue;
                }
            }
        }
        return resultList;
    }
}

//arrays.sort使用的是快速排序
//在map中key不能重复，后put的key-value 会覆盖之前已经put的。在list中是可以重复的
//对list排序使用Collections.sort