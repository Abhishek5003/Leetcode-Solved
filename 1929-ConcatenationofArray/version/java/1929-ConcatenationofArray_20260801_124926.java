// Last updated: 8/1/2026, 12:49:26 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] arr = new int[2*nums.length];
4        for(int i = 0; i < nums.length; i++){
5            arr[i] = nums[i];
6            arr[i+nums.length] = nums[i];
7        }
8        return arr;
9    }
10}