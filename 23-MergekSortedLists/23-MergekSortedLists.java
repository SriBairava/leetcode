// Last updated: 21/09/2026, 22:22:44
1/* 
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    public Node(int _val) { val = _val; }
11    public Node(int _val, Node _left, Node _right, Node _next) {
12        val = _val;
13        left = _left;
14        right = _right;
15        next = _next;
16    }
17};
18*/
19
20class Solution {
21    public Node connect(Node root) {
22        if (root == null) return root;
23
24        Node leftMost = root;
25
26        // Traverse level by level
27        while (leftMost.left != null) {
28            Node curr = leftMost;
29            while (curr != null) {
30                // Connect left -> right
31                curr.left.next = curr.right;
32
33                // Connect right -> next's left (if available)
34                if (curr.next != null) {
35                    curr.right.next = curr.next.left;
36                }
37
38                curr = curr.next; // Move to next node in the level
39            }
40            leftMost = leftMost.left; // Go to next level
41        }
42        return root;
43    }
44}