// Last updated: 20/07/2026, 11:09:07
class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain = 0;
        int currentGain = 0;

        for (int i = 0; i < gain.length; i++) {
            currentGain += gain[i];
            maxGain = Math.max(maxGain, currentGain);
        }

        return maxGain;
    }
}