# Last updated: 01/10/2026, 09:05:50
class Solution(object):
    def minimumCost(self, nums, k):
        MOD = 10 ** 9+ 7
        resources = k 
        operations = 0
        cost = 0
        for x in nums:
            if resources<x:
                need = (x-resources+k-1)//k
                cost = (cost+(operations + 1 + operations + need)*need//2)%MOD
                operations += need
                resources += need*k
            resources -= x
        return cost
        