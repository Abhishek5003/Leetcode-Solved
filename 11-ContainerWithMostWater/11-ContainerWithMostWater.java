// Last updated: 7/21/2026, 5:02:32 PM
class Solution {
    public int maxArea(int[] height) {
        int i = 0,j = height.length-1;
        int maxArea = Integer.MIN_VALUE;
         
        while(i < j){
            int width = j-i;
            int high = Math.min(height[i],height[j]);
            int currArea = width*high;
            maxArea = Math.max(maxArea,currArea);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}