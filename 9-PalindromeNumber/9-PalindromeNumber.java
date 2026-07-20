// Last updated: 20/07/2026, 11:12:37
class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }

        return original == rev;
    }
}
