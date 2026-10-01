// Last updated: 01/10/2026, 09:07:42
class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y,count=0;
        while(z>0)
        {
            if((z&1)==1)
            {
                count++;
            }
            z = z>>>1;
        }

        return count;
    }
}