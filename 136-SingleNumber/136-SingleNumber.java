// Last updated: 7/21/2026, 5:01:44 PM
class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int i = 0; i < nums.length ; i++){
            unique = unique ^ nums[i];
        }
        return unique;
    }
}