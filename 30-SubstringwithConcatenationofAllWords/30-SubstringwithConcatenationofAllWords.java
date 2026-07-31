// Last updated: 31/07/2026, 09:09:06
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder res = new StringBuilder();
4
5        while (columnNumber > 0) {
6            columnNumber--;
7            res.insert(0, (char) ((columnNumber % 26) + 'A'));
8            columnNumber /= 26;
9        }
10        
11        return res.toString();        
12    }
13}