// Last updated: 7/21/2026, 5:02:16 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length;
        int mid;
        if(target>nums[high-1]){
            return high;
        }
        while(low<=high){
              mid=(low+high)/2;
            if(nums[mid]==target){  
                return mid;
            }
          
            if(target<nums[mid]){     
            high=mid-1;    
            }else{
            low=mid+1;        
            }
          
        }
         return  low;   
    }
}