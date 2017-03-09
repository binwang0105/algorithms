class Solution(object):
    
    def combinationSum4(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if not nums:
            return 0   "pythonÈçºÎÅĞ¶Ï¿Õlist"
        temp = []
        res = []
        self.helper(res, nums, temp, target)
        return len(res)
        
    def helper(self, res, nums, temp, target):
        if target == 0:
            a = [] + temp
            if not a in res:
                res.append(a)
            return
        
        if target < 0:
            return
        
        for i in range(len(nums)):
            temp.append(nums[i])
            self.helper(res, nums, temp, target-nums[i])
            temp.pop(len(temp)-1)