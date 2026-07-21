// Last updated: 7/21/2026, 5:01:36 PM
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            numbers.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(numbers);
        int i = 0;
        ListNode nums = head;
        while(nums != null){
            nums.val = numbers.get(i);
            i++;
            nums = nums.next;
        }
        return head;
    }
}