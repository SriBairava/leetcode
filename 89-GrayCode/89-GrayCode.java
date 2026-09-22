// Last updated: 22/09/2026, 09:22:30
class Solution {
    public List<Integer> grayCode(int n) {
        int total=1<<n;
        List<Integer> gray=new ArrayList<>();
        for(int i=0;i<total;i++){
            gray.add(i^(i>>1));
        }
        return gray;
    }
}