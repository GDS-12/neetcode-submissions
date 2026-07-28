/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first=head,second=slow.next;
        ListNode prev=null, next=slow.next;
        slow.next=null;
        while(next!=null){
            next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        second=prev;
        ListNode temp1=null,temp2=null;
        while(second!=null){
            temp1=first.next;
            temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
