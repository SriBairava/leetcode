// Last updated: 01/10/2026, 09:05:55
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        long ans = 0;
        int n = nums.length;
        for(int i = 0; i < n;i++){
            int even = 0;
            int odd = 0;
            for(int j = i;j<n;j++){
                if(nums[j]%2==0){
                    even++;
                }else{
                    odd++;
                }
                if(odd>0 && (long)even*b<=(long)odd*a){
                    ans++;
                }
            }
        }
        return (int) ans;
    }
}