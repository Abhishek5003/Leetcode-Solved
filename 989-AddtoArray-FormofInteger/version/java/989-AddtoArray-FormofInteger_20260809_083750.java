// Last updated: 8/9/2026, 8:37:50 AM
1class Solution {
2    public List<Integer> addToArrayForm(int[] nums, int k) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        // Right se left tak har digit ko process karo
7        for (int i = nums.length - 1; i >= 0; i--) {
8
9            // nums ki current digit + k ki last digit
10            int sum = nums[i] + (k % 10);
11
12            // Answer ki current digit
13            ans.add(sum % 10);
14
15            // k ki last digit hata do aur carry add kar do
16            k = (k / 10) + (sum / 10);
17        }
18
19        // Agar k me abhi bhi digits bachi hain
20        while (k > 0) {
21            ans.add(k % 10);
22            k /= 10;
23        }
24
25        // Humne digits ulte order me add ki hain
26        Collections.reverse(ans);
27
28        return ans;
29    }
30}