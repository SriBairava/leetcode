// Last updated: 25/09/2026, 07:54:34
1class Solution {
2    public String countAndSay(int n) {
3        String res = "1";
4        for (int i = 1; i < n; i++) {
5            res = buildNext(res);
6        }
7        return res;
8    }
9
10    private String buildNext(String s) {
11        StringBuilder result = new StringBuilder();
12        int count = 1;
13        for (int i = 1; i < s.length(); i++) {
14            if (s.charAt(i) == s.charAt(i - 1)) {
15                count++;
16            } else {
17                result.append(count).append(s.charAt(i - 1));
18                count = 1;
19            }
20        }
21        result.append(count).append(s.charAt(s.length() - 1));
22        return result.toString();
23    }
24}