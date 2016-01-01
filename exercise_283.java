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

//���ܿ�����������飬��ôֻ�����滻
//in-place��������Ҫ������ָ�룬һ��
//��ͣ�����ɨ���ҵ�����λ�ã�Ȼ���
//ǰ���Ǹ�ָ�뽻��λ�ü��ɡ�ͳ��0�ĸ�����

//ʹ������"ָ��"x��y����ʼ��y = 0
//����x��������nums��
//��nums[x]��0���򽻻�nums[x]��nums[y]
//����y+1
//�ٰ�ĩβ�ļ�λȫ��0���棡