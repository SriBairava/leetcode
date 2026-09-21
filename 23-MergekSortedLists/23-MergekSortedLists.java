// Last updated: 21/09/2026, 22:08:07
1class Solution {
2    public int totalNQueens(int n) {
3        int allPositions = (1 << n) - 1;
4
5        return backtrack(
6            allPositions,
7            0,
8            0,
9            0
10        );
11    }
12
13    private int backtrack(
14            int allPositions,
15            int columns,
16            int diagonal1,
17            int diagonal2) {
18
19        // All columns are occupied
20        if (columns == allPositions) {
21            return 1;
22        }
23
24        // Find all safe positions
25        int available = allPositions
26                & ~(columns | diagonal1 | diagonal2);
27
28        int count = 0;
29
30        while (available != 0) {
31            // Get the rightmost available position
32            int position = available & -available;
33
34            // Remove this position
35            available -= position;
36
37            // Place queen and move to next row
38            count += backtrack(
39                allPositions,
40                columns | position,
41                (diagonal1 | position) << 1,
42                (diagonal2 | position) >> 1
43            );
44        }
45
46        return count;
47    }
48}