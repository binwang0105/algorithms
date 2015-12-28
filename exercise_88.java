public class Merge {
	 public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] retNums = new int[m+n];
	        int i = 0;
	        int j = 0;
	        for(int k = 0; k < m+n; k++){
	            if(i >= m)
	                retNums[k] = nums2[j++];
	            else if(j >= n)
	                retNums[k] = nums1[i++];
	            else if(nums1[i] < nums2[j])
	                retNums[k] = nums1[i++];
	            else
	                retNums[k] = nums2[j++];
	        }
	        return retNums;
	    }
	 
	 public static void main(String[] args){
		 int[] nums1 = {1, 2};
		 int[] nums2 = {4, 5, 6 ,7};
		 int[] nums = new int[6];
		 nums = merge(nums1, 2, nums2, 4);
		 for(int i = 0; i < nums.length; i++){
			 System.out.println(nums[i]);
		}
	 }
}
