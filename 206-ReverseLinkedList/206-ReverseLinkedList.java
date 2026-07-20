// Last updated: 20/07/2026, 11:10:47
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode  temp=curr.next;    //step1
        curr.next=prev;              //step2
         prev = curr;                //step3
        curr=temp;                   //step4
    }
    return prev;
    }
}