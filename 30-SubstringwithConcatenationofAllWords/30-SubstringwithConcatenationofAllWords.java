// Last updated: 31/07/2026, 09:06:17
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int end = s.length() - 1;
4
5        while (end >= 0 && s.charAt(end) == ' ') {
6            end--;
7        }
8
9        int start = end;
10        while (start >= 0 && s.charAt(start) != ' ') {
11            start--;
12        }
13
14        return end - start;        
15    }
16}