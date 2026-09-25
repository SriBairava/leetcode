// Last updated: 25/09/2026, 07:53:37
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode a = new ListNode(0);
14        a.next = head;
15        ListNode fast = a;
16        for (int i = 0; i <= n; i++) {
17            fast = fast.next;
18        }
19        ListNode slow = a;
20        while(fast!=null){
21            fast=fast.next;
22            slow=slow.next;
23        }
24        slow.next = slow.next.next;
25        return a.next;
26    }
27}