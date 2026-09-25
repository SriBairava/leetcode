// Last updated: 25/09/2026, 07:50:15
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int res = 0;
4        int count = 0;
5
6        for (int n : nums) {
7            if (n == 0) {
8                count = 0;
9            } else {
10                count++;
11            }
12
13            if (res < count) {
14                res = count;
15            }
16        }
17
18        return res;        
19    }
20}