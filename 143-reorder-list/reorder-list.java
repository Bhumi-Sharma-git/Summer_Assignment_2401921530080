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
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
ListNode second=slow.next;
slow.next=null;
ListNode newhead=reverse(second);
ListNode first=head;
ListNode curr=newhead;
                 while(curr!=null){
                    ListNode temp1=first.next;
                    ListNode temp2=curr.next;
                    first.next=curr;
                  curr.next=temp1;
                    first=temp1;
                  curr=temp2;
                 }
    }

                public ListNode reverse(ListNode head){
                    if(head==null ||head.next==null){
                        return head;
                    }
                    ListNode newHead=reverse(head.next);
                    ListNode front=head.next;
                    front.next=head;
                    head.next=null;
                   return newHead;
                 }
    
}