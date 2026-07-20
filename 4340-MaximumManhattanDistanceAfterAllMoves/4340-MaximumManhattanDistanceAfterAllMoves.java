// Last updated: 20/07/2026, 11:08:44
class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l=0, r = 0,wild=0;
        for(char ch : moves.toCharArray()){
                if(ch == 'U') u++;
                else if (ch =='D') d++;
                else if (ch =='L') l++;
                else if (ch =='R') r++;
                else wild++;
        }
        int vertical = Math.abs(u - d);
        int horizontal = Math.abs(r-l);
        return vertical + horizontal + wild;
    }
}