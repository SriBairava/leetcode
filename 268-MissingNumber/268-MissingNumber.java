// Last updated: 25/09/2026, 07:40:53
1public class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for (int i = 1; i <= n; i++) {
6            ans = ans ^ i;
7        }
8        for (int i = 0; i < nums.length; i++) {
9            ans = ans ^ nums[i];
10        }
11        return ans;
12    }
13}
14