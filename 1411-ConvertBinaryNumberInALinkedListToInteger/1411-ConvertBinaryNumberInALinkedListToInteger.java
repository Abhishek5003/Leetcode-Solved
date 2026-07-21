// Last updated: 7/21/2026, 5:00:06 PM
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
    public int getDecimalValue(ListNode head) {
        int i = 0;
        ListNode nums = head;
        while(nums.next != null){
            i++;
            nums = nums.next;
        }
        int sum = 0;
        ListNode temp = head;
        while(temp != null){
            sum += temp.val*Math.pow(2,i);
            i--;
            temp = temp.next;
        }

        return sum;
    }
}