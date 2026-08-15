// Last updated: 8/15/2026, 1:01:51 PM
/*
 * Problem: 75. Sort Colors
 * Pattern: Three Pointers / Dutch National Flag
 * 
 * Approach:
 * - Maintain three pointers:
 *   low  -> next position for 0
 *   mid  -> current element
 *   high -> next position for 2
 * 
 * Invariant:
 * - [0 ... low-1]      -> 0's
 * - [low ... mid-1]    -> 1's
 * - [mid ... high]     -> Unknown
 * - [high+1 ... n-1]   -> 2's
 * 
 * Logic:
 * 1. If nums[mid] == 0
 *    - Swap(nums, low, mid)
 *    - low++
 *    - mid++
 * 
 * 2. If nums[mid] == 1
 *    - mid++
 * 
 * 3. If nums[mid] == 2
 *    - Swap(nums, mid, high)
 *    - high--
 *    - Do NOT increment mid because the swapped element from the right is unprocessed.
 * 
 * Termination:
 * - Stop when mid > high.
 * 
 * Why not increment mid after swapping with high?
 * - The element coming from the high index hasn't been examined yet.
 * - It could be 0, 1, or 2, so it must be processed in the next iteration.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 * 
 * Key Takeaway:
 * Partition the array into four regions while traversing once:
 * [0 ... low-1] -> 0's
 * [low ... mid-1] -> 1's
 * [mid ... high] -> Unknown
 * [high+1 ... n-1] -> 2's
 * 
 * Interview Tip:
 * Think of it as maintaining four regions instead of sorting. The algorithm keeps expanding the 0's region from the left and the 2's region from the right while shrinking the unknown region.
*/

1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length-1;
6        while(mid <= high){
7            if(nums[mid] == 0){
8                swap(nums,low,mid);
9                low++;
10                mid++;
11            }else if(nums[mid] == 1){
12                mid++;
13            }else{
14                swap(nums,mid,high);
15                high--;
16            }
17        }
18    }
19
20    public void swap(int[] nums, int i, int j){
21        int temp = nums[i];
22        nums[i] = nums[j];
23        nums[j] = temp;
24    }
25}