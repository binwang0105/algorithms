int max = nums[0], min = nums[0];
        int rst = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > 0){
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            } else {
                int oldMax = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], oldMax * nums[i]);
            }
            rst = Math.max(rst, max);
        }

        return rst;