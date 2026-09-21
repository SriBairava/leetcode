// Last updated: 21/09/2026, 22:15:14
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        Map<Integer, Integer> count = new HashMap<>();
4        int k = 0;
5
6        for (int num : nums) {
7            count.put(num, count.getOrDefault(num, 0) + 1);
8            if (count.get(num) <= 2) {
9                nums[k] = num;
10                k++;
11            }
12        }
13
14        return k;      
15    }
16}