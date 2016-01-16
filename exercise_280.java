public class Solution {
    public void wiggleSort(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i = 2; i < nums.length; i++){
            if(i % 2 == 0)
                exch(nums, i-1, i);
        }
    }
    
    public void exch(int[] arr, int former, int latter)
    {
        int temp = 0;
        temp = arr[former];
        arr[former] = arr[latter];
        arr[latter] = temp;
    }
}

//���ǿ����Ƚ�����������ʱ��ӵ�3��Ԫ�ؿ�ʼ������3��Ԫ�غ͵�2��Ԫ�ؽ�����Ȼ���ٴӵ�5��Ԫ�ؿ�ʼ������5��Ԫ�غ͵�4��Ԫ�ؽ������Դ�����
//���˴�2��ʼ���򣬴�0��ʼ�ᷢ��Խ��