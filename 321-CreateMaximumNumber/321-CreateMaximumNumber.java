// Last updated: 24/09/2026, 10:36:36
1class Solution {
2    public List<List<Integer>> palindromePairs(String[] words) {
3        Map<String, Integer> wmap = new HashMap<>();
4        List<List<Integer>> ans = new ArrayList<>();
5        for (int i = 0; i < words.length; i++)
6            wmap.put(words[i], i);
7        for (int i = 0; i < words.length; i++) {
8            if (words[i].equals("")) {
9                for (int j = 0; j < words.length; j++) {
10                    String w = words[j];
11                    if (isPal(w, 0, w.length()-1) && j != i) {
12                        ans.add(List.of(i, j));
13                        ans.add(List.of(j, i));
14                    }
15                }
16                continue;
17            }
18            StringBuilder sb = new StringBuilder(words[i]);
19            sb.reverse();
20            String bw = sb.toString();
21            if (wmap.containsKey(bw)) {
22                int res = wmap.get(bw);
23                if (res != i) ans.add(List.of(i, res));
24            }
25            for (int j = 1; j < bw.length(); j++) {
26                if (isPal(bw, 0, j-1)) {
27                    String s = bw.substring(j);
28                    if (wmap.containsKey(s))
29                        ans.add(List.of(i, wmap.get(s)));
30                }
31                if (isPal(bw, j, bw.length()-1)) {
32                    String s = bw.substring(0,j);
33                    if (wmap.containsKey(s))
34                        ans.add(List.of(wmap.get(s), i));
35                }
36            }
37        }
38        return ans;
39    }
40    
41    private boolean isPal(String word, int i, int j) {
42        while (i < j)
43            if (word.charAt(i++) != word.charAt(j--)) return false;
44        return true;
45    }
46}