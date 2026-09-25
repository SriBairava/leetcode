// Last updated: 25/09/2026, 07:43:46
1class Solution {
2    public String toHex(int num) {
3
4        if (num == 0) {
5            return "0";
6        }
7
8        StringBuilder sb = new StringBuilder(8);
9        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
10
11        while (num != 0) {
12
13            sb.append(hex[num & 0b1111]);
14            num >>>= 4;
15        }
16
17        return sb.reverse().toString();
18    }
19}