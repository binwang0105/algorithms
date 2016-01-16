public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        
        int[] snums = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            snums[i] = nums[i];
        }
        
        int k = snums.length - 1;
        for(int i = 1; i < nums.length; i = i + 2){
            nums[i] = snums[k--];
        }
        
        k = (snums.length - 1) / 2;
        for(int j = 0; j < nums.length; j = j + 2){
            nums[j] = snums[k--];
        }
    }
}

//��ԭ�������򣬵õ������ĸ�������snums
//��ԭ�����ż��λ�±����snums��ĩβԪ��--
//��ԭ���������λ�±����snums���м�Ԫ��--