// Last updated: 01/10/2026, 09:05:53
class Solution {
    public boolean checkGoodInteger(int n) {

        int digitSum = 0;
        int squareSum = 0;

        while (n > 0) {
            int digit = n % 10;
            digitSum += digit;
            squareSum += digit * digit;
            n /= 10;
        }

        return (squareSum - digitSum) >= 50;
    }
}