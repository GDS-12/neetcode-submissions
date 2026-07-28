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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            head=null;
            return head;
        }
        n = (count-n)+1;
        count=1;
        ListNode prev=null;
        temp=head;
        while(temp!=null && count!=n){
            prev=temp;
            temp=temp.next;
            count++;
        }
        if(prev==null){
            head=head.next;
            return head;
        }
        prev.next=temp.next;
        return head;
    }
}
