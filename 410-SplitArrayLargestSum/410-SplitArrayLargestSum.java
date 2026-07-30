// Last updated: 7/30/2026, 7:00:03 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int n = nums.length - 1;

        if (k > nums.length) return -1;

        for (int i = 0; i <= n; i++) sum += nums[i];

        int st = 0;
        int end = sum;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(nums, mid, n, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public boolean isValid(int arr[], int mid, int n, int m) {
        int stu = 1, pages = 0;

        for (int i = 0; i <= n; i++) {
            if (arr[i] > mid) return false;

            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                stu++;
                pages = arr[i];
            }
        }

        if (stu > m) return false;

        return true;
    }
}