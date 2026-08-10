// Last updated: 8/10/2026, 8:58:32 PM
class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0) return 0;
        int evenCount = 0;
        for(int number : nums)
            if((int)Math.log10(number)%2 != 0)
                evenCount++;
            
        
        return evenCount;
    }
}