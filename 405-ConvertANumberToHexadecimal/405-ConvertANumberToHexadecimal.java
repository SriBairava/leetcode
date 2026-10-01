// Last updated: 01/10/2026, 09:08:13
class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder(8);
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        while (num != 0) {

            sb.append(hex[num & 0b1111]);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}