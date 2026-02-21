# 3190. Find Minimum Operations to Make All Elements Divisible by Three
# leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three
"""
You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3.
"""
class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        ops = 0
        for num in nums:
            if num % 3 != 0:
                ops += 1
        return ops
