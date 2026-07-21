// Last updated: 7/21/2026, 5:00:04 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int mid = n; // or nums.length / 2
        int[] ans = new int[nums.length];

        int index = 0;

        for (int i = 0; i < mid; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + mid];
        }

        return ans;
    }
}