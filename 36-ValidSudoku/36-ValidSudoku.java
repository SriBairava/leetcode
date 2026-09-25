// Last updated: 25/09/2026, 07:57:17
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3    Set seen = new HashSet();
4    for (int i=0; i<9; ++i) {
5        for (int j=0; j<9; ++j) {
6            if (board[i][j] != '.') {
7                String b = "(" + board[i][j] + ")";
8                if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
9                    return false;
10            }
11        }
12    }
13    return true;
14}
15}