// Last updated: 8/3/2026, 9:31:22 PM
/*
 * IN-PLACE INDEX MARKING / NEGATIVE MARKING
 * ==========================================
 * 
 * Used in:
 * - LeetCode 448 - Find All Numbers Disappeared in an Array
 * - LeetCode 442 - Find All Duplicates in an Array
 * - LeetCode 41 - First Missing Positive (variation)
 * 
 * 
 * 1. WHEN CAN WE USE IT?
 * ----------------------
 * 
 * Usually when:
 * 
 * 1 <= nums[i] <= n
 * 
 * where n = length of array.
 * 
 * Since values are from 1 to n, every value can represent an index:
 * 
 * Value 1 -> Index 0
 * Value 2 -> Index 1
 * Value 3 -> Index 2
 * ...
 * Value n -> Index n-1
 * 
 * Formula:
 * 
 * index = value - 1
 * 
 * 
 * 2. MAIN IDEA
 * ------------
 * 
 * Instead of creating:
 * 
 * boolean[] visited
 * 
 * or
 * 
 * HashSet<Integer>
 * 
 * we use the SAME ARRAY to remember which numbers have appeared.
 * 
 * We use the SIGN of an element as a visited flag:
 * 
 * Positive -> Not marked
 * Negative -> Marked / Visited
 * 
 * 
 * 3. HOW TO MARK A NUMBER
 * -----------------------
 * 
 * For every nums[i]:
 * 
 * int idx = Math.abs(nums[i]) - 1;
 * 
 * Then:
 * 
 * if (nums[idx] > 0) {
 *     nums[idx] = -nums[idx];
 * }
 * 
 * Meaning:
 * 
 * If value x exists in the array,
 * make nums[x - 1] negative.
 * 
 * 
 * 4. WHY Math.abs() IS IMPORTANT
 * ------------------------------
 * 
 * Suppose:
 * 
 * nums[i] = -7
 * 
 * The - sign was added by us earlier as a marker.
 * 
 * The ORIGINAL value is still:
 * 
 * Math.abs(-7) = 7
 * 
 * Therefore:
 * 
 * int idx = Math.abs(nums[i]) - 1;
 * 
 * gives:
 * 
 * idx = 7 - 1 = 6
 * 
 * 
 * 5. DO WE LOSE THE ORIGINAL VALUE?
 * ---------------------------------
 * 
 * NO.
 * 
 * Suppose:
 * 
 * nums[3] = 7
 * 
 * After marking:
 * 
 * nums[3] = -7
 * 
 * We changed ONLY the sign.
 * 
 * The original value is still available:
 * 
 * Math.abs(-7) = 7
 * 
 * So think of:
 * 
 *  7 -> value = 7, visited = false
 * -7 -> value = 7, visited = true
 * 
 * Therefore one integer stores TWO pieces of information:
 * 
 * Absolute Value -> Original number
 * Sign           -> Visited / Not visited
 * 
 * 
 * 6. EXAMPLE
 * ----------
 * 
 * nums = [4,3,2,7,8,2,3,1]
 * 
 * Start:
 * 
 * [4,3,2,7,8,2,3,1]
 * 
 * Read 4:
 * 
 * index = 4 - 1 = 3
 * 
 * Mark index 3:
 * 
 * [4,3,2,-7,8,2,3,1]
 * 
 * 
 * Read 3:
 * 
 * index = 3 - 1 = 2
 * 
 * Mark index 2:
 * 
 * [4,3,-2,-7,8,2,3,1]
 * 
 * 
 * Read 2:
 * 
 * index = 2 - 1 = 1
 * 
 * Mark index 1:
 * 
 * [4,-3,-2,-7,8,2,3,1]
 * 
 * 
 * Now when we reach -7:
 * 
 * Math.abs(-7) = 7
 * 
 * index = 7 - 1 = 6
 * 
 * So we can STILL process the original value 7.
 * 
 * 
 * After processing the complete array:
 * 
 * [-4,-3,-2,-7,8,2,-3,-1]
 * 
 * 
 * 7. HOW TO FIND MISSING NUMBERS
 * ------------------------------
 * 
 * After marking, traverse the array again.
 * 
 * If:
 * 
 * nums[i] > 0
 * 
 * then:
 * 
 * i + 1
 * 
 * was NEVER present in the original array.
 * 
 * Example:
 * 
 * [-4,-3,-2,-7,8,2,-3,-1]
 *              ^ ^
 * 
 * Positive indices:
 * 
 * Index 4 -> Number 5
 * Index 5 -> Number 6
 * 
 * Answer:
 * 
 * [5,6]
 * 
 * 
 * 8. WHY DOES THIS WORK?
 * ----------------------
 * 
 * If number x EXISTS:
 * 
 * nums[x - 1] becomes negative.
 * 
 * If number x DOES NOT EXIST:
 * 
 * nums[x - 1] remains positive.
 * 
 * Therefore:
 * 
 * Negative -> Number exists
 * Positive -> Number is missing
 * 
 * 
 * 9. COMPLEXITY
 * -------------
 * 
 * First traversal  -> O(n)
 * Second traversal -> O(n)
 * 
 * Total Time:
 * 
 * O(n)
 * 
 * Extra Space:
 * 
 * O(1)
 * 
 * The output List is normally not counted as auxiliary space.
 * 
 * 
 * 10. INTERVIEW RECOGNITION
 * -------------------------
 * 
 * If a problem says:
 * 
 * - Array contains numbers in range 1 to n
 * - Find missing numbers
 * - Find duplicate numbers
 * - Need O(n) time
 * - Need O(1) extra space
 * 
 * Think:
 * 
 * "Can I use the array itself as a visited array?"
 * 
 * 
 * 11. CORE TEMPLATE
 * -----------------
 * 
 * for (int i = 0; i < nums.length; i++) {
 * 
 *     int idx = Math.abs(nums[i]) - 1;
 * 
 *     if (nums[idx] > 0) {
 *         nums[idx] = -nums[idx];
 *     }
 * }
 * 
 * 
 * 12. GOLDEN RULE
 * ---------------
 * 
 * ABSOLUTE VALUE = DATA
 * SIGN           = MARKER
 * 
 * Never trust the sign when reading the original value.
 * 
 * Always use:
 * 
 * Math.abs(nums[i])
 * 
 * The sign may have been changed by an earlier iteration.
*/

1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> list = new ArrayList<>();
4        int idx = -1;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] < 0){
7                idx = nums[i]*-1-1;
8            }else{
9                idx = nums[i]-1;
10            }
11            
12            if(nums[idx]>0){
13                nums[idx] = -nums[idx];
14            }
15            
16        }
17        
18        for(int i = 0; i < nums.length; i++){
19            if(nums[i] > 0){
20                list.add(i+1);
21            };
22            
23        }
24        
25        return list;
26    }
27}