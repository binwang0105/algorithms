public class Solution {
    public void rotate(int[] nums, int k) {
       
        if(nums == null || nums.length < 2){
            return;
        }
        
        if(k > nums.length)
            k = k % nums.length;
        
        int[] temp = new int[k];
        
        int j = k-1;
        
        //copy the last k elements
        for(int i = nums.length - 1; i >= nums.length - k; i--){
               temp[j--] = nums[i];
        }
        
        //move the lower elements in nums for k steps
        for(int m = nums.length - 1; m >= k; m--){
               nums[m] = nums[m-k];
        }
        
        for(int n = 0; n < k; n++){
               nums[n] = temp[n];
        }
    }
}

//�Ӻ�������k��Ԫ��λ��nums.length-k��
//���������ƶ����⻹Ҫ����k���ܻ��nums�ĳ��Ȼ�Ҫ��������Ҫ��k = k % nums.length