// Last updated: 8/15/2026, 12:33:46 PM
/*
 * # 18. 4Sum
 * 
 * Difficulty: Medium
 * 
 * Pattern:
 * Sorting + Two Pointers
 * 
 * Approach:
 * 1. Sort the array.
 * 2. Fix first element (i).
 * 3. Fix second element (j).
 * 4. Apply two pointers (left, right).
 * 5. Compare sum with target.
 * 6. Skip duplicates for i, j, left, and right.
 * 
 * Key Learnings:
 * - Extension of 3Sum.
 * - Fix 2 elements + Two Pointers.
 * - Use long for sum (avoid overflow).
 * - Duplicate handling is very important.
 * 
 * Time Complexity:
 * O(n³)
 * 
 * Space Complexity:
 * O(1) (excluding output)
 * 
 * Template:
 * Sort
 * ↓
 * for(i)
 *     skip duplicates
 *     for(j)
 *         skip duplicates
 *         left = j + 1
 *         right = n - 1
 *         while(left < right)
 * 
 * Common Mistakes:
 * - Using int instead of long.
 * - Forgetting duplicate check for j.
 * - Wrong duplicate check for right.
 * - left should start from j + 1.
 * 
 * Revision:
 * 2Sum → 3Sum → 4Sum → kSum
*/

1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        List<List<Integer>> ans = new ArrayList<>();
5        int n = nums.length;
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < n - 3; i++) {
10
11            if (i > 0 && nums[i] == nums[i - 1]) continue;
12
13            for (int j = i + 1; j < n - 2; j++) {
14
15                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
16
17                int left = j + 1;
18                int right = n - 1;
19
20                while (left < right) {
21                    long sum = (long)nums[i] + nums[j] + nums[left] +nums[right];
22                    if(sum < target){
23                        left++;
24                    }else if(sum > target){
25                        right--;
26                    }else{
27                        List<Integer> quardlet = new ArrayList<>();
28                        quardlet.add(nums[i]);
29                        quardlet.add(nums[j]);
30                        quardlet.add(nums[left]);
31                        quardlet.add(nums[right]);
32                        ans.add(quardlet);
33                        left++;
34                        right--;
35
36                        while(left < right && nums[left] == nums[left-1]) left++;
37                        while(left < right && nums[right] == nums[right+1]) right--;
38                    }
39                }
40            }
41        }
42        return ans;
43    }
44}