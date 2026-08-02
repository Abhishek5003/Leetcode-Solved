// Last updated: 8/2/2026, 10:06:41 PM
/*
 * 📝 Notes
 * 
 * • We only need the top 3 distinct maximum values, so sorting the entire array is unnecessary.
 * 
 * • Maintain three variables:
 *   - first  → largest
 *   - second → second largest
 *   - third  → third largest
 * 
 * • Initialize all three with Long.MIN_VALUE.
 *   Reason:
 *   - Input values are int.
 *   - Integer.MIN_VALUE is a valid input.
 *   - Long.MIN_VALUE acts as a safe sentinel value that can never appear in the input.
 * 
 * • Skip duplicates before updating:
 *   if (num == first || num == second || num == third) continue;
 * 
 * • Update order:
 *   - If num > first:
 *       third = second;
 *       second = first;
 *       first = num;
 *   - Else if num > second:
 *       third = second;
 *       second = num;
 *   - Else if num > third:
 *       third = num;
 * 
 * • Use else-if, NOT separate if statements.
 *   Reason:
 *   - Only one position should be updated per element.
 *   - Multiple ifs can incorrectly update the same number multiple times.
 * 
 * • No need for separate handling of array lengths (1 or 2).
 *   If third is still Long.MIN_VALUE after traversal, fewer than 3 distinct elements exist, so return first.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Pattern:
 * Maintain Top K Values (Top 3) + One Pass + Constant Space
 * 
 * Interview Takeaway:
 * Before sorting or using extra space, ask:
 * "Can I maintain only the information I actually need?"
*/

1class Solution {
2    public int thirdMax(int[] nums) {
3        long first = Long.MIN_VALUE;
4        long second = Long.MIN_VALUE;
5        long third = Long.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8
9    // Skip duplicates
10            if (nums[i] == first || nums[i] == second || nums[i] == third)
11            continue;
12
13            if (nums[i] > first) {
14                third = second;
15                second = first;
16                first = nums[i];
17
18            } else if (nums[i] > second) {
19
20                third = second;
21                second = nums[i];
22
23            } else if (nums[i] > third) {
24
25                third = nums[i];
26
27            }
28        }
29            
30        if (third == Long.MIN_VALUE)
31            return (int) first;
32
33        return (int) third;
34
35    }
36}