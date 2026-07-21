// Last updated: 7/21/2026, 5:00:11 PM
class Solution {
    public int heightChecker(int[] heights) {
        int[] destination = new int[heights.length];
        System.arraycopy(heights, 0, destination, 0, heights.length);
        Arrays.sort(destination);
        int count = 0;
        for(int i = 0; i < heights.length;i++)
            if(heights[i] != destination[i]) count++;
            return count;
        
    }
}