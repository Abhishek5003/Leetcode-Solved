// Last updated: 7/21/2026, 4:59:55 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}