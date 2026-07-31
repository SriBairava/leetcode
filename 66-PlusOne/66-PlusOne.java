// Last updated: 31/07/2026, 09:23:10
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode res = head;
4
5        while (head != null && head.next != null) {
6            if (head.val == head.next.val) {
7                head.next = head.next.next;
8            } else {
9                head = head.next;
10            }
11        }
12
13        return res;        
14    }
15}