// Last updated: 8/1/2026, 11:45:48 AM
/*
 * # LeetCode 486 – Predict the Winner (DP + Game Theory)
 * 
 * ## Problem
 * 
 * Two players play optimally. On each turn, a player picks either the leftmost or rightmost element of the array. Return `true` if Player 1 can win (or tie), otherwise `false`.
 * 
 * ---
 * 
 * # Key Observation
 * 
 * ❌ Greedy does **not** work.
 * 
 * Choosing the larger of the two ends is not always optimal because a smaller choice now may force the opponent into a worse position later.
 * 
 * Example:
 * 
 * ```text
 * nums = [1, 5, 233, 7]
 * 
 * Greedy:
 * P1 -> 7
 * P2 -> 233
 * P1 loses
 * 
 * Optimal:
 * P1 -> 1
 * P2 -> 5 or 7
 * P1 -> 233
 * P1 wins
 * ```
 * 
 * ---
 * 
 * # Main Idea
 * 
 * Instead of storing both players' scores, store the **maximum score difference** the current player can achieve.
 * 
 * Define:
 * 
 * ```java
 * solve(i, j)
 * ```
 * 
 * Meaning:
 * 
 * > Maximum score difference (Current Player − Opponent) obtainable from the subarray `nums[i...j]`.
 * 
 * ---
 * 
 * # State
 * 
 * ```java
 * solve(i, j)
 * ```
 * 
 * * `i` = left index
 * * `j` = right index
 * 
 * ---
 * 
 * # Choices
 * 
 * ### Pick Left
 * 
 * Current player gains:
 * 
 * ```java
 * nums[i]
 * ```
 * 
 * Opponent then becomes the current player for:
 * 
 * ```java
 * solve(i + 1, j)
 * ```
 * 
 * Net advantage:
 * 
 * ```java
 * nums[i] - solve(i + 1, j)
 * ```
 * 
 * ---
 * 
 * ### Pick Right
 * 
 * Net advantage:
 * 
 * ```java
 * nums[j] - solve(i, j - 1)
 * ```
 * 
 * ---
 * 
 * # Recurrence
 * 
 * ```java
 * solve(i, j) =
 * max(
 *     nums[i] - solve(i + 1, j),
 *     nums[j] - solve(i, j - 1)
 * )
 * ```
 * 
 * ---
 * 
 * # Base Case
 * 
 * Only one element remains.
 * 
 * ```java
 * if (i == j)
 *     return nums[i];
 * ```
 * 
 * ---
 * 
 * # Final Answer
 * 
 * ```java
 * solve(0, n - 1) >= 0
 * ```
 * 
 * Why `>= 0`?
 * 
 * * Positive → Player 1 wins.
 * * Zero → Tie.
 * * The problem considers a tie as a win for Player 1.
 * 
 * ---
 * 
 * # DP Memoization
 * 
 * ```java
 * Integer[][] dp;
 * 
 * if(dp[i][j] != null)
 *     return dp[i][j];
 * ```
 * 
 * Store the answer for every `(i, j)` pair.
 * 
 * ---
 * 
 * # Complexity
 * 
 * ### Recursion
 * 
 * Time: **O(2ⁿ)**
 * 
 * Space: **O(n)**
 * 
 * ---
 * 
 * ### Memoization
 * 
 * Time: **O(n²)**
 * 
 * Space: **O(n²)**
 * 
 * ---
 * 
 * ### Optimized Tabulation
 * 
 * Time: **O(n²)**
 * 
 * Space: **O(n)**
 * 
 * ---
 * 
 * # Interview Explanation (30 Seconds)
 * 
 * "This is a two-player optimal game, so greedy doesn't work. Instead of maintaining two scores, I define a DP state where `solve(i, j)` represents the maximum score difference the current player can achieve over the opponent from the subarray `i` to `j`. At each step, the player chooses either the left or right element and subtracts the opponent's best possible advantage. The recurrence is:
 * 
 * ```java
 * max(nums[i] - solve(i + 1, j),
 *     nums[j] - solve(i, j - 1))
 * ```
 * 
 * The final answer is `solve(0, n - 1) >= 0`."
 * 
 * ---
 * 
 * # Pattern Recognition
 * 
 * Whenever you see:
 * 
 * * Two players
 * * Alternate turns
 * * Both play optimally
 * * Choose from ends (or limited moves)
 * * Return winner / maximum advantage
 * 
 * Think:
 * 
 * * **Game Theory**
 * * **Minimax**
 * * **DP on intervals**
 * * **Score Difference DP**
 * 
 * This pattern also appears in problems like **Stone Game**, **Optimal Strategy for a Game**, and similar interval DP problems.
*/

1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5
6        // dp[j] = maximum score difference current player can achieve
7        // for the subarray nums[i...j]
8
9        for (int i = n - 1; i >= 0; i--) {
10            dp[i] = nums[i];
11
12            for (int j = i + 1; j < n; j++) {
13                int pickLeft = nums[i] - dp[j];
14                int pickRight = nums[j] - dp[j - 1];
15
16                dp[j] = Math.max(pickLeft, pickRight);
17            }
18        }
19
20        return dp[n - 1] >= 0;
21    }
22}