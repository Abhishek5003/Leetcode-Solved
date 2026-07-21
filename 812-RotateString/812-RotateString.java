// Last updated: 7/21/2026, 5:00:33 PM
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) {
            return false;
        }

        char[] arr = s.toCharArray();

        int j = 0;

        while(j < arr.length) {

            char first = arr[0];

            int i = 0;

            while(i < arr.length - 1) {
                arr[i] = arr[i + 1];
                i++;
            }

            arr[arr.length - 1] = first;

            String rotated = new String(arr);

            if(rotated.equals(goal)) {
                return true;
            }

            j++;
        }

        return false;
    }
}