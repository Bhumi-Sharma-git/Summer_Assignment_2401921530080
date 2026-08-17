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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        ListNode[] res= new ListNode[k];
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        int avg=len/k;
        int extra=len%k;

        for(int i=0;i<k;i++){
            if(temp==null) break;
            ListNode prev=null;
            ListNode currHead=temp;
            len=0;
            while(len<avg ){
                prev=temp;
                temp=temp.next;
                len++;
            }
            if(extra>0){
                prev=temp;
                temp=temp.next;
                extra--;
            }
            
            prev.next= null; 
               //detachprevious list
            res[i]=currHead; //insert head
        }
        return res;
    }
}