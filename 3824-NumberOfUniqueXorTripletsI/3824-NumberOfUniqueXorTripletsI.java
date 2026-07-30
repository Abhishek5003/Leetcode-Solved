// Last updated: 7/30/2026, 6:59:16 AM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int ans = 1;
        while(ans <= n) 
            ans <<= 1;
        
        return ans;
    }
}