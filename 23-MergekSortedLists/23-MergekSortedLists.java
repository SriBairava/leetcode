// Last updated: 21/09/2026, 22:15:56
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode deleteDuplicates(ListNode head) {
17        // Dummy node handles duplicates at the beginning
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20
21        ListNode prev = dummy;
22        ListNode curr = head;
23
24        while (curr != null) {
25
26            // Duplicate group found
27            if (curr.next != null && curr.val == curr.next.val) {
28                int duplicateValue = curr.val;
29
30                // Skip all nodes with this duplicate value
31                while (curr != null && curr.val == duplicateValue) {
32                    curr = curr.next;
33                }
34
35                // Connect previous unique node to next distinct node
36                prev.next = curr;
37            } else {
38                // Current node is unique
39                prev = curr;
40                curr = curr.next;
41            }
42        }
43
44        return dummy.next;
45    }
46}