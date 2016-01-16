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

//我们可以先将数组排序，这时候从第3个元素开始，将第3个元素和第2个元素交换。然后再从第5个元素开始，将第5个元素和第4个元素交换，以此类推
//忘了从2开始排序，从0开始会发生越界