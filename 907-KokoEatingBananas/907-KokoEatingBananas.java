// Last updated: 7/30/2026, 6:59:43 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int st = 1;
        int end = 0;

        for (int i = 0; i < n; i++) {
            end = Math.max(end, piles[i]);
        }

        int ans = -1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (isValid(piles, mid, n, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public boolean isValid(int arr[], int mid, int n, int h) {

        int hours = 0;

        for (int i = 0; i < n; i++) {

            hours += (arr[i] + mid - 1) / mid; // ceil(arr[i] / mid)

            if (hours > h) {
                return false;
            }
        }

        return true;
    }
}