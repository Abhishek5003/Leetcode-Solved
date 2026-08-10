// Last updated: 8/10/2026, 8:12:30 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0;
4        int j = height.length-1;
5        int maxArea = Integer.MIN_VALUE;
6        while(i < j){
7            int width = j-i;
8            int length = Math.min(height[i],height[j]);
9            int currArea = width*length;
10            maxArea = Math.max(maxArea,currArea);
11            if(height[i] < height[j]){
12                i++;
13            }else{
14                j--;
15            }
16        }
17
18        return maxArea;
19    }
20}