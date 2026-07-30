// Last updated: 7/30/2026, 6:59:37 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int n = weights.length - 1;

        for (int i = 0; i <= n; i++) sum += weights[i];

        int st = 0;
        int end = sum;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(weights, mid, n, days)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public boolean isValid(int arr[], int mid, int n, int days) {
        int day = 1, load = 0;

        for (int i = 0; i <= n; i++) {
            if (arr[i] > mid) return false;

            if (load + arr[i] <= mid) {
                load += arr[i];
            } else {
                day++;
                load = arr[i];
            }
        }

        return day <= days;
    }
}