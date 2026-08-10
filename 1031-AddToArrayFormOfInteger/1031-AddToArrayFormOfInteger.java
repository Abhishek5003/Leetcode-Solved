// Last updated: 8/10/2026, 8:58:54 PM
class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();

        // Right se left tak har digit ko process karo
        for (int i = nums.length - 1; i >= 0; i--) {

            // nums ki current digit + k ki last digit
            int sum = nums[i] + (k % 10);

            // Answer ki current digit
            ans.add(sum % 10);

            // k ki last digit hata do aur carry add kar do
            k = (k / 10) + (sum / 10);
        }

        // Agar k me abhi bhi digits bachi hain
        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }

        // Humne digits ulte order me add ki hain
        Collections.reverse(ans);

        return ans;
    }
}