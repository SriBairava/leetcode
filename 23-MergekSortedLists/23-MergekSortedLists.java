// Last updated: 21/09/2026, 22:22:17
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int numDistinct(String S, String T) {
18    // array creation
19    int[][] mem = new int[T.length()+1][S.length()+1];
20
21    // filling the first row: with 1s
22    for(int j=0; j<=S.length(); j++) {
23        mem[0][j] = 1;
24    }
25    
26    // the first column is 0 by default in every other rows but the first, which we need.
27    
28    for(int i=0; i<T.length(); i++) {
29        for(int j=0; j<S.length(); j++) {
30            if(T.charAt(i) == S.charAt(j)) {
31                mem[i+1][j+1] = mem[i][j] + mem[i+1][j];
32            } else {
33                mem[i+1][j+1] = mem[i+1][j];
34            }
35        }
36    }
37    
38    return mem[T.length()][S.length()];
39}
40}