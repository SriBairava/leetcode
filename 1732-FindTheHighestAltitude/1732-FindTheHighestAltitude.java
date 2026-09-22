// Last updated: 22/09/2026, 09:18:21
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