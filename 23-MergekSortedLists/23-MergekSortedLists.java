// Last updated: 21/09/2026, 22:25:32
1class Solution {
2    public int ladderLength(String st, String end, List<String> list) {
3
4        //using patter storing method
5        //needed thing 1.set 2.2*map(one for vis and second for pattern) 3.Queue as usual bfs
6
7        Set<String> set = new HashSet<>();
8
9        for (String s : list)
10            set.add(s);
11
12        if (!set.contains(end))
13            return 0;
14
15        Map<String, Boolean> vis = new HashMap<>();
16        vis.put(st, true);
17
18        Map<String, List<String>> pattern = new HashMap<>();
19
20        Queue<String> que = new LinkedList<>();
21        que.offer(st);
22
23        for (String s : list) {
24
25            //for pattern crteing
26
27            //synatx for computeIfAbsebt(key , function) as in place of fxn using lamda expression
28            for (int i = 0; i < s.length(); i++) {
29
30                String word = s.substring(0, i) + "*" + s.substring(i + 1);
31                pattern.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
32
33            }
34
35        }
36
37        int lvl = 1;
38        while (!que.isEmpty()) {
39
40            int size = que.size();
41
42            for (int i = 0; i < size; i++) {
43
44                String s = que.poll();
45
46                if (s.equals(end))
47                    return lvl;
48
49                for (int j = 0; j < s.length(); j++) {
50                    String pat = s.substring(0, j) + "*" + s.substring(j + 1);
51                    for (String nei : pattern.getOrDefault(pat, List.of())) {
52                        if (!vis.getOrDefault(nei, false)) {
53                            vis.put(nei, true);
54                            que.offer(nei);
55                        }
56                    }
57                }
58            }
59
60            lvl++;
61        }
62
63        return 0;
64    }
65}