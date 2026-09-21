// Last updated: 21/09/2026, 22:10:54
1class Solution {
2
3    public String getPermutation(int n, int k) {
4
5        int fact = 1;
6        List<Integer> numbers = new ArrayList<>();
7
8        for (int i = 1; i < n; i++) {
9            fact = fact * i;
10            numbers.add(i);
11        }
12
13        numbers.add(n);
14
15        String ans = "";
16
17        k = k - 1;
18
19        while (true) {
20
21            ans += numbers.get(k / fact);
22            numbers.remove(k / fact);
23
24            if (numbers.size() == 0) {
25                break;
26            }
27
28            k = k % fact;
29            fact = fact / numbers.size();
30        }
31
32        return ans;
33    }
34}