// Last updated: 25/09/2026, 08:06:58
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3
4        if ((num & 1) == 1) {
5            return false;
6        }
7
8        int sum = 1;
9
10        for (int i = 2; i <= Math.sqrt(num); i++) {
11
12            if (num % i == 0) {
13                sum += i;
14
15                if (i != num / i) {
16                    sum += num / i;
17                }
18            }
19        }
20
21        return sum == num;
22    }
23}