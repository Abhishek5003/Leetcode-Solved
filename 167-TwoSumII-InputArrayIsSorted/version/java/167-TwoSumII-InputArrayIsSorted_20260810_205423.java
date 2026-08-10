// Last updated: 8/10/2026, 8:54:23 PM
/*
 * LeetCode 167 – Two Sum II (Sorted Array)
 * 
 * Pattern:
 * - Two Pointers
 * 
 * When to Use:
 * - Array is sorted.
 * - Find a pair whose sum equals the target.
 * 
 * Algorithm:
 * 1. Set i = 0 (left pointer)
 * 2. Set j = n - 1 (right pointer)
 * 3. While (i < j):
 *    - sum = numbers[i] + numbers[j]
 *    - If sum == target:
 *        return {i + 1, j + 1}
 *    - Else if sum > target:
 *        j--
 *    - Else:
 *        i++
 * 
 * Why does it work?
 * - Array is sorted.
 * - If sum is too large, move j left to decrease the sum.
 * - If sum is too small, move i right to increase the sum.
 * 
 * Pointer Movement:
 * sum > target  →  j--
 * sum < target  →  i++
 * sum == target →  Return answer
 * 
 * Example:
 * numbers = [2, 7, 11, 15]
 * target = 9
 * 
 * i = 0, j = 3
 * 2 + 15 = 17 > 9 → j--
 * 
 * i = 0, j = 2
 * 2 + 11 = 13 > 9 → j--
 * 
 * i = 0, j = 1
 * 2 + 7 = 9 ✓
 * Return {1, 2}
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Important Points:
 * - Array must be sorted.
 * - Return 1-based indices.
 * - Two pointers are more efficient than brute force.
*/

1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int i = 0; 
4        int j = nums.length-1;
5        int[] ans = new int[2];
6        while(i < j){
7            int sum = (nums[i] + nums[j]);
8            if(sum == target) {
9                ans[0] = i+1;
10                ans[1] = j+1;
11                break;
12            }
13
14            if(sum > target){
15                j--;
16            }else{
17                i++;
18            }
19        }
20        return ans;
21    }
22}