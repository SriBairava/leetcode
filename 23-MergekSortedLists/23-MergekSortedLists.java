// Last updated: 21/09/2026, 22:07:21
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int res = nums[0];
4        int total = 0;
5
6        for (int n : nums) {
7            if (total < 0) {
8                total = 0;
9            }
10
11            total += n;
12            res = Math.max(res, total);
13        }
14
15        return res;        
16    }
17}