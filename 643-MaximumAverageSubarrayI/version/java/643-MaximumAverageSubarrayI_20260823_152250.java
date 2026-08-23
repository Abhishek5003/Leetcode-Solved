// Last updated: 8/23/2026, 3:22:50 PM
/*
 * # 643. Maximum Average Subarray I
 * 
 * Approach:
 * - Use Sliding Window.
 * - Find the sum of the first k elements.
 * - Store it as maxSum.
 * - Slide the window:
 *   - Add the new element.
 *   - Remove the leftmost element.
 *   - Update maxSum.
 * - Return maxSum / k as the maximum average.
 * 
 * Formula:
 * sum = sum + nums[i] - nums[i - k]
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 * 
 * Mistakes I Made:
 * - Forgot to move the left side of the window (x++).
 * - Returned maxSum instead of (double) maxSum / k.
 * - Used an unnecessary if before Math.max().
 * 
 * Learning:
 * - In Sliding Window, one element enters and one element leaves the window.
 * - nums[i - k] is cleaner than maintaining a separate left pointer.
 * - Use long for sum to avoid integer overflow.
*/

1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        long sum = 0;
4        for(int i = 0; i < k; i++){
5            sum = nums[i] + sum;
6        }
7        long max_sum = sum;
8        int x = 0;
9        long curr_sum = sum;
10        for(int j = k; j < nums.length; j++){
11            curr_sum = nums[j] + curr_sum - nums[x];
12            max_sum  = Math.max(max_sum, curr_sum);
13            x++;
14        }
15        return (double) max_sum/k;
16    }
17}