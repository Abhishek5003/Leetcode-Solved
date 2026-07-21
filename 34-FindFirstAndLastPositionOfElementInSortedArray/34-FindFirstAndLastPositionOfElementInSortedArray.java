// Last updated: 7/21/2026, 5:02:18 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int idx = -1;
        int[] arr = {0,0};
        while(low <= high){
            int mid = low + (high - low) / 2;
            // int mid = (low + high)/2;
            if(nums[mid] > target){
                high = (mid - 1);
            }else if(nums[mid] < target){
                low = (mid + 1);
            }else { // nums[mid] == target
                idx = mid;
                high = mid -1;
            }
        }
        arr[0] = idx;
        idx = -1;
        low = 0; 
        high = nums.length-1;
        while(low <= high){
            int midl = low + (high - low) / 2;
            // int midl = (low + high)/2;
            if(nums[midl] > target){
                high = (midl - 1);
            }else if(nums[midl] < target){
                low = (midl + 1);
            }else { // nums[mid] == target
                idx = midl;
                low = midl + 1;
            }
        }
        arr[1] = idx;
        return arr;
    }
}