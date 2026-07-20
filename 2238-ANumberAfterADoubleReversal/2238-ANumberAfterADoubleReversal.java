// Last updated: 20/07/2026, 11:08:54
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