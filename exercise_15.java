public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set set = new HashSet();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(nums == null && nums.length < 3)
            return resultList;
            //先sort一遍array    
        Arrays.sort(nums);
        
        for(int i = 0; i <= nums.length - 2; i++){
            
            int begin = i + 1;
            int end = nums.length - 1;
            int target = 0 - nums[i];
            
            while(begin < end){
                List<Integer> list = new ArrayList<Integer>();
                if(target < nums[begin] + nums[end])
                    end--;
                else if(target > nums[begin] + nums[end])
                    begin++;
                else{
                    list.add(0-target);
                    list.add(nums[begin]);
                    list.add(nums[end]);
                    Collections.sort(list);
                    if(list.size()!=0)
                        set.add(list);
                    begin++;
                    end--;
                    continue;
                }
            }
        }
        
        Iterator it = set.iterator();
        
        while(it.hasNext())
           resultList.add((List<Integer>)it.next());
        
        return resultList;
    }
}

//arrays.sort使用的是快速排序
//在map中key不能重复，后put的key-value 会覆盖之前已经put的。在list中是可以重复的
//对list排序使用Collections.sort