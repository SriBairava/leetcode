// Last updated: 02/08/2026, 09:02:23
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long ans = 0;
4
5        for(int i = 0; i < nums.length; i++){
6            for(int j = i + 1; j < nums.length; j++){
7                long g = gcd(nums[i],nums[j]);
8                long strength = ((long)nums[i]*nums[j])/(g*g);
9                ans = Math.max(ans,strength);
10            }
11        }
12        return ans;
13    }
14    private long gcd(long a, long b){
15        while(b!=0){
16            long temp = a%b;
17            a = b;
18            b = temp;
19        }
20        return a;
21    }
22}