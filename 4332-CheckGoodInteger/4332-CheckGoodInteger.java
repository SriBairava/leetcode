// Last updated: 20/07/2026, 11:08:39
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