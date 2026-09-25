// Last updated: 25/09/2026, 08:06:43
1public class Solution {
2    public String[] findRelativeRanks(int[] nums) {
3        int[][] pair = new int[nums.length][2];
4        
5        for (int i = 0; i < nums.length; i++) {
6            pair[i][0] = nums[i];
7            pair[i][1] = i;
8        }
9        
10        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
11        
12        String[] result = new String[nums.length];
13
14        for (int i = 0; i < nums.length; i++) {
15            if (i == 0) {
16                result[pair[i][1]] = "Gold Medal";
17            }
18            else if (i == 1) {
19                result[pair[i][1]] = "Silver Medal";
20            }
21            else if (i == 2) {
22                result[pair[i][1]] = "Bronze Medal";
23            }
24            else {
25                result[pair[i][1]] = (i + 1) + "";
26            }
27        }
28
29        return result;
30    }
31}