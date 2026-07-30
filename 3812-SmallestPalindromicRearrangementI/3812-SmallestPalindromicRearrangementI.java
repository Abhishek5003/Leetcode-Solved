// Last updated: 7/30/2026, 6:59:20 AM
class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        // Single character
        if (n == 1) return s;

        int mid = n / 2;

        // Sort only the left half
        Arrays.sort(arr, 0, mid);

        // Mirror the left half to the right half
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;

        while (i >= 0) {
            arr[j++] = arr[i--];
        }

        return new String(arr);
    }
}