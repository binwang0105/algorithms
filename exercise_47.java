public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length)
            list.add(new ArrayList<>(tempList));
            
        for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            helper(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}