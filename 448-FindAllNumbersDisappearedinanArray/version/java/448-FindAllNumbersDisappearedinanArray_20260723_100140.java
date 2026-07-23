// Last updated: 7/23/2026, 10:01:40 AM
/*
 * # LeetCode 448 - Find All Disappeared Numbers (Sorting Approach)
 * 
 * ## Approach
 * 
 * 1. Sort the array.
 * 2. Maintain an `expected` variable starting from `1`.
 * 3. Traverse the sorted array:
 * 
 *    * If `nums[i] < expected` → Duplicate element, skip it.
 *    * If `nums[i] == expected` → Required number found, increment `expected`.
 *    * If `nums[i] > expected` → All numbers from `expected` to `nums[i] - 1` are missing. Add them to the answer and increment `expected` until it equals `nums[i]`.
 * 4. After traversal, if `expected <= n`, add all remaining numbers to the answer.
 * 
 * ## Key Observation
 * 
 * Using the index (`i + 1`) does **not** work after sorting because duplicate elements shift the positions of later elements. Therefore, an independent `expected` counter is required.
 * 
 * ## Complexity
 * 
 * * **Time:** `O(n log n)` (due to sorting)
 * * **Space:** `O(1)` extra space (excluding the output list)
 * 
 * ## Alternative Approach
 * 
 * Use a boolean array of size `n + 1`:
 * 
 * * Mark every number as present.
 * * Traverse from `1` to `n`.
 * * Any unmarked index represents a missing number.
 * 
 * **Complexity:**
 * 
 * * Time: `O(n)`
 * * Space: `O(n)`
*/

1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        boolean[] present = new boolean[nums.length + 1];
4        List<Integer> ans = new ArrayList<>();
5
6        for (int num : nums) {
7            present[num] = true;
8        }
9
10        for (int i = 1; i <= nums.length; i++) {
11            if (!present[i]) {
12                ans.add(i);
13            }
14        }
15
16        return ans;
17    }
18}