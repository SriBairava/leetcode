// Last updated: 21/09/2026, 22:01:55
1class Solution {
2    public int reverse(int x) {
3        int res = 0;
4        boolean isNegative = x < 0;
5        String strX = String.valueOf(Math.abs(x));
6        StringBuilder sb = new StringBuilder(strX).reverse();
7        
8        try {
9            res = Integer.parseInt(sb.toString());
10        } catch (NumberFormatException e) {
11            return 0;
12        }
13        
14        return isNegative ? -res : res;       
15    }
16}