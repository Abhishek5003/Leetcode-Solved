// Last updated: 7/21/2026, 5:02:06 PM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find length
        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        // Step 2: Make circular
        temp.next = head;

        // Step 3: Optimize k
        k = k % n;
        int stepsToNewHead = n - k;

        // Step 4: Find new tail
        ListNode newTail = head;
        for(int i = 1; i < stepsToNewHead; i++)
            newTail = newTail.next;
        
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}