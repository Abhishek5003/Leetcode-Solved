// Last updated: 7/21/2026, 5:00:57 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = "";

            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";

            ans.add(s.isEmpty() ? String.valueOf(i) : s);
        }

        return ans;
    }
}