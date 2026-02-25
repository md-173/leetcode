'''
1108. Defanging an IP Address
Solved
Easy
Topics
premium lock icon
Companies
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

'''
# leetcode.com/problems/defanging-an-ip-address/

class Solution(object):
    def defangIPaddr(self, address: str) -> str:
        return address.replace('.','[.]')
        
