// Last updated: 20/07/2026, 11:08:49
import java.util.*;
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solve(nums,k,true),solve(nums,k,false));
    }
    private long solve(int[]nums,int k, boolean isMultiply){
        long v0 = Long.MIN_VALUE/2;
        long v1 = Long.MIN_VALUE/2;
        long v2 = Long.MIN_VALUE/2;
        long maxAns = Long.MIN_VALUE;

        for(int x:nums){
            Long opx = isMultiply?(long)x * k:(long)x/k;
            long nextv0 = Math.max((long)x,v0 + x);
            long nextv1 = Math.max(opx, Math.max(v0+opx,v1+opx));
            long nextv2 = Math.max(v1 + x,v2 + x);

            v0 = nextv0;
            v1 = nextv1;
            v2 = nextv2;

            maxAns = Math.max(maxAns, Math.max(v0,Math.max(v1,v2)));
        }
        return maxAns;
    }
}