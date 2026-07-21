// Last updated: 7/21/2026, 5:00:44 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        // if(nums.length == 3){
        //     if(nums[0] != nums[1]){
        //         return nums[0];
        //     }
        //     if(nums[1] != nums[2]){
        //         return nums[2];
        //     }
        // }

        for(int i = 1; i < nums.length ; i+=2){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}