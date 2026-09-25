// Last updated: 25/09/2026, 07:35:23
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        return nums[n/2];
6    }
7}