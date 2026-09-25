// Last updated: 25/09/2026, 07:44:31
1class Solution {
2        public boolean repeatedSubstringPattern(String str) {
3        String s = str + str;
4        return s.substring(1, s.length() - 1).contains(str);
5    }
6}