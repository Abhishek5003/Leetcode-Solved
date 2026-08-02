// Last updated: 8/2/2026, 9:01:07 PM
/*
 * 📝 Notes
 * 
 * • Read the problem carefully.
 *   - If the third distinct maximum does not exist, return the maximum element.
 * 
 * • "Distinct" means duplicates are counted only once.
 *   Example:
 *   [2,2,3,1] → Distinct = {1,2,3}
 * 
 * • After sorting:
 *   - Largest = last element
 *   - Third largest can only be found after removing duplicates.
 * 
 * • Common pattern to remove duplicates from a sorted array:
 *   list.add(nums[0]);
 *   for (int i = 1; i < nums.length; i++) {
 *       if (nums[i] != nums[i - 1]) {
 *           list.add(nums[i]);
 *       }
 *   }
 * 
 * • Wrapper class reminder:
 *   - List<Long> → add((long) nums[i]);
 *   - Retrieve using .intValue() or .longValue() when needed.
 * 
 * • Edge case:
 *   - If distinct elements < 3, return the maximum element.
 * 
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * 
 * Pattern:
 * Sorting + Remove Duplicates + Edge Case Handling
 * 
 * Interview Follow-up:
 * Can be optimized to O(n) time and O(1) space without sorting by maintaining the top three distinct maximums.
*/

1class Solution {
2    public int thirdMax(int[] nums) {
3
4        if (nums.length == 1) return nums[0];
5        if (nums.length == 2) return Math.max(nums[0], nums[1]);
6
7        Arrays.sort(nums);
8
9        List<Long> arr = new ArrayList<>();
10        arr.add((long) nums[0]);
11
12        for (int i = 1; i < nums.length; i++) {
13            if (nums[i] == nums[i - 1]) {
14                continue;
15            }
16            arr.add((long) nums[i]);
17        }
18
19        if (arr.size() < 3) {
20            return arr.get(arr.size() - 1).intValue();
21        }
22
23        return arr.get(arr.size() - 3).intValue();
24    }
25}