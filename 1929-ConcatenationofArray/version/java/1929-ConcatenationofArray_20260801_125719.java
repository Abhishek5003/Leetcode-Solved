// Last updated: 8/1/2026, 12:57:19 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] arr = new int[2*nums.length];
4        System.arraycopy(nums,0,arr,0,nums.length);
5        System.arraycopy(nums,0,arr,nums.length,nums.length);
6        return arr;
7    }
8}