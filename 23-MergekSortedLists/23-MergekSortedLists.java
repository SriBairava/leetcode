// Last updated: 21/09/2026, 22:19:00
1class Solution {
2    public List<Integer> grayCode(int n) {
3        int total=1<<n;
4        List<Integer> gray=new ArrayList<>();
5        for(int i=0;i<total;i++){
6            gray.add(i^(i>>1));
7        }
8        return gray;
9    }
10}