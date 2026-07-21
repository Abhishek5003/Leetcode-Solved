// Last updated: 7/21/2026, 5:01:08 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length){
            nums[j++] = 0;
        }

    }
}