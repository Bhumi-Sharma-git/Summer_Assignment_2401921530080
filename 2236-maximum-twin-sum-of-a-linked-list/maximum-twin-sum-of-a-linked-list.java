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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
       slow.next=null;
      ListNode newHead= reverse(second);
ListNode curr=newHead;
slow=head;
int max=-1;
int ans=-1;
while(curr!=null){
    ans= slow.val+ curr.val;
    max=Math.max(ans,max);
    slow=slow.next;
    curr=curr.next;
}
return max;

    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
}