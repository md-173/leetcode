'''
3467. Transform Array by Parity
You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:

Replace each even number with 0.
Replace each odd numbers with 1.
Sort the modified array in non-decreasing order.
Return the resulting array after performing these operations.
https://leetcode.com/problems/transform-array-by-parity
'''
class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        r = []
        for num in nums:
            if num % 2 == 0:
                r.append(0)
            else:
                r.append(1)
        r.sort()
        return r
