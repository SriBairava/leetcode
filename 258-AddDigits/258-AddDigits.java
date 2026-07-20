// Last updated: 20/07/2026, 11:10:40
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        while(num % 9 == 0) return 9;
        return num%9;
    }
}