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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp= head;
        ListNode prevLast=null;
        while(temp!=null){
            ListNode kNode= getKthNode(temp,k);
            if(kNode==null){
                if(prevLast!=null) prevLast.next=temp;
                break;
            }
            ListNode nextNode= kNode.next;
            kNode.next=null;
            reverseLinkedList(temp);
            if(temp==head){
                head=kNode;
            }
            else {
                prevLast.next=kNode;
            }
            prevLast=temp;
            temp= nextNode;
        }
        return head;
    }
    ListNode getKthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null&&k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    ListNode reverseLinkedList(ListNode temp){
        if(temp==null||temp.next==null){
            return temp;
        }
        ListNode newHead= reverseLinkedList(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        temp.next=null;
        return newHead;
    }
}