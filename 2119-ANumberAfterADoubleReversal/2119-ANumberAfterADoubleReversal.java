// Last updated: 22/09/2026, 09:17:51
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        else if(num%10==0){
            return false;
        }
        return true;
    }
}