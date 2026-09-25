// Last updated: 25/09/2026, 07:54:08
1class Solution {
2    public int divide(int dividend, int divisor) {
3        long a = dividend;
4        long b = divisor;
5
6        boolean negative = (a < 0) ^ (b < 0);
7
8        a = Math.abs(a);
9        b = Math.abs(b);
10
11        long quotient = 0;
12
13        while (a >= b) {
14            long currentDivisor = b;
15            long multiple = 1;
16
17            while (a >= currentDivisor + currentDivisor) {
18                currentDivisor += currentDivisor;
19                multiple += multiple;
20            }
21
22            a -= currentDivisor;
23            quotient += multiple;
24        }
25
26        if (negative) {
27            quotient = -quotient;
28        }
29
30        if (quotient > Integer.MAX_VALUE) {
31            return Integer.MAX_VALUE;
32        }
33
34        if (quotient < Integer.MIN_VALUE) {
35            return Integer.MIN_VALUE;
36        }
37
38        return (int) quotient;
39    }
40}