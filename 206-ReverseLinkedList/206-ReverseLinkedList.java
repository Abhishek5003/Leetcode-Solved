// Last updated: 7/21/2026, 5:01:27 PM
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // just return head directly
        }

        ListNode slow = head;
        ListNode curr = head.next;

        while (curr != null) {
            ListNode fast = curr.next; // store next node
            curr.next = slow;          // reverse link
            slow = curr;               // move slow forward
            curr = fast;               // move curr forward
        }

        head.next = null; // old head becomes tail
        head = slow;      // slow is new head
        return head;      // ✅ must return the new head
    }
}