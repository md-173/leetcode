'''
3701. Compute Alternating Sum
You are given an integer array nums.

The alternating sum of nums is the value obtained by adding elements at even indices and subtracting elements at odd indices. That is, nums[0] - nums[1] + nums[2] - nums[3]...

Return an integer denoting the alternating sum of nums.
leetcode.com/problems/compute-alternating-sum/
'''

class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        s=0
        for i in range(len(nums)):
            if i % 2 == 0:
                s += nums[i]
            else:
                s -= nums[i]
        return s
            
