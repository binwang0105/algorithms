public class Solution {
    public int majorityElement(int[] nums) {
        int maxValue = 0;
        int maxKey = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            map.put(nums[i], map.get(nums[i])+1);
        }
        
        Iterator it = map.entrySet().iterator();
        for(int i = 0; i < map.size(); i++){
            Map.Entry entry =(Map.Entry)it.next();
            int value = (Integer)entry.getValue();
            if(value > maxValue){
                maxValue = value;
                maxKey = (Integer)entry.getKey();
            }
        }
        return maxKey;
    }
}

// map.entrySet().iterator();
// 通过size()获得map的大小，即entry的个数
// iterator遍历的是map的entry, Map.Entry entry =(Map.Entry)it.next();
// entry.getKey entry.getValue