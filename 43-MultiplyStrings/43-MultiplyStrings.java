// Last updated: 17/09/2026, 09:31:37
1class Solution {
2    public String multiply(String num1, String num2) {
3        if ("0".equals(num1) || "0".equals(num2)) return "0";
4
5        int m = num1.length();
6        int n = num2.length();
7        int[] pos = new int[m + n];
8
9        for (int i = m - 1; i >= 0; i--) {
10            for (int j = n - 1; j >= 0; j--) {
11                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
12                int p1 = i + j;
13                int p2 = i + j + 1;
14                int sum = mul + pos[p2];
15
16                pos[p2] = sum % 10;
17                pos[p1] += sum / 10;
18            }
19        }
20
21        StringBuilder sb = new StringBuilder();
22        for (int p : pos) {
23            if (!(sb.length() == 0 && p == 0)) {
24                sb.append(p);
25            }
26        }
27
28        return sb.length() == 0 ? "0" : sb.toString();
29    }
30}