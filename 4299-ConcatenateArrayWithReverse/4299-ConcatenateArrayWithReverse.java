// Last updated: 8/10/2026, 8:57:36 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] ans = new int[2 * nums.length];
        int n = nums.length - 1;

        // Copy all elements
        System.arraycopy(nums, 0, ans, 0, nums.length);

        // Append reverse
        for (int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[n--];
        }

        return ans;
    }
}