public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set set = new HashSet();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(nums == null && nums.length < 3)
            return resultList;
            //��sortһ��array    
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

//arrays.sortʹ�õ��ǿ�������
//��map��key�����ظ�����put��key-value �Ḳ��֮ǰ�Ѿ�put�ġ���list���ǿ����ظ���
//��list����ʹ��Collections.sort