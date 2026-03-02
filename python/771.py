'''
771. Jewels and Stones
Solved
Easy
Topics
premium lock icon
Companies
Hint
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

https://leetcode.com/problems/jewels-and-stones/
'''
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        o = 0
        for jewel in jewels:
            o += stones.count(jewel)
        return o
