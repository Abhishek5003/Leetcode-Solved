// Last updated: 7/21/2026, 5:01:56 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head.next;
        ListNode slow = head;
        while(curr != null){
            if(slow.val == curr.val){
                slow.next = curr.next;   // delete duplicate
            } else {
                slow = curr;             // move slow only if not duplicate
            }
            curr = curr.next;
        }
        return head;
    }
}