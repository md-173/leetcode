'''
280. Convert Date to Binary
You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.

date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.

Return the binary representation of date.

 
https://leetcode.com/problems/convert-date-to-binary
'''
class Solution:
    def convertDateToBinary(self, date: str) -> str:
        return "-".join(f"{int(d):b}" for d in date.split("-"))
