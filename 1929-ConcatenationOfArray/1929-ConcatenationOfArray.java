// Last updated: 22/09/2026, 09:18:01
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[]ans=new int[2*len];
        for(int i = 0;i<len;i++){
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }
        return ans;
    }
}