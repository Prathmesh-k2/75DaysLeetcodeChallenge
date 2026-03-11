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
    public ListNode removeElements(ListNode head, int val) {
          while(head != null && head.val == val){
            head = head.next;
        }
        ListNode temp = head;
        
        ListNode prev=null;
        while(temp != null &&temp.next !=null){
            prev=temp;
            if(temp.next.val==val){
                 prev.next=prev.next.next;
            }else{
                temp = temp.next;
            }
    
        }
        return head;
        
    }
}