// Last updated: 7/21/2026, 5:01:57 PM
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0,count1 = 0,count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }

        int j = 0;
        for(int x = 0; x < count0; x++){
            nums[j++] = 0;
        }
        for(int x = 0; x < count1; x++){
            nums[j++] = 1;
        }
        for(int x = 0; x < count2; x++){
            nums[j++] = 2;
        }
    }
}