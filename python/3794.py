'''
3794. Reverse String Prefix
You are given a string s and an integer k.

Reverse the first k characters of s and return the resulting string.
https://leetcode.com/problems/reverse-string-prefix/
'''
class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        first = s[:k]
        end = s[k:]
        rev = first[::-1]
        return rev + end
