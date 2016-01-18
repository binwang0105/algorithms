public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        //����ȥ�ظ�
        
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(nums == null && nums.length < 3)
            return resultList;
   
        Arrays.sort(nums);
        //��sortһ��
        
        //��ȷ�������
        for(int i = 0; i <= nums.length - 2; i++){
            
            int start = i+1;
            int end = nums.length - 1;
            
            //��ȷ�������
            while(start < end){
                
                //start��end�ᷢ���仯�����������ﴴ��list
                List<Integer> list = new ArrayList<Integer>();
                
                int sum = nums[start] + nums[end] + nums[i];
                
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    
                    //���set����û�г��ֹ�list�����ռ��뵽resultList��ȥ
                    if(set.add(list)){
                        resultList.add(list);
                    }
                    
                    //�ı�start��end
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

//arrays.sortʹ�õ��ǿ�������
//��map��key�����ظ�����put��key-value �Ḳ��֮ǰ�Ѿ�put�ġ���list���ǿ����ظ���
//��list����ʹ��Collections.sort