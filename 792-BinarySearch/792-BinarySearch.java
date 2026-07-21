// Last updated: 7/21/2026, 5:00:35 PM
class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {

            // int mid = (st + end) / 2;
            int mid = st + (end - st) / 2; // if upper mid not works on platform due big integers 

            if (target < nums[mid]) {
                end = (mid - 1);
            } else if (target > nums[mid]) {
                st = (mid + 1);
            } else {
                return mid;
            }
        }
        return -1;
    }
}