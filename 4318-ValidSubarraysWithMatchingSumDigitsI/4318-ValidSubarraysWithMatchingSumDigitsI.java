// Last updated: 20/07/2026, 11:08:47
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count =0;
        for(int i=0; i<n;i++){
            long currentSum = 0;
            for(int j = i;j<n;j++){
                currentSum += nums[j];
                long lastDigit = (int)(currentSum % 10);
                long temp = currentSum;
                while (temp >= 10){
                    temp /=10;
                }
                long firstDigit = temp;
                if(firstDigit == x && lastDigit == x){
                    count ++;

                }
            }
        } 
        return count;
    }
}