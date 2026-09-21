// Last updated: 21/09/2026, 22:29:07
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
12    public ListNode sortList(ListNode head) {
13        if (head == null) return null;
14
15        ArrayList<Integer> list = new ArrayList<>();
16
17      
18        ListNode temp = head;
19        while (temp != null) {
20            list.add(temp.val);
21            temp = temp.next;
22        }
23       
24        Collections.sort(list);
25        temp = head;
26        int i = 0;
27        while (temp != null) {
28            temp.val = list.get(i++);
29            temp = temp.next;
30        }
31
32        return head;
33    }
34}
35 