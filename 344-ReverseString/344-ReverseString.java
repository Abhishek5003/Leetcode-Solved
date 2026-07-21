// Last updated: 7/21/2026, 5:01:00 PM
class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while(i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}