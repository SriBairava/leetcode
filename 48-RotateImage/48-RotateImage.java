// Last updated: 25/09/2026, 08:04:46
1public class Solution {
2    public String[] findWords(String[] words) {
3        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
4        Map<Character, Integer> map = new HashMap<>();
5        for(int i = 0; i<strs.length; i++){
6            for(char c: strs[i].toCharArray()){
7                map.put(c, i);//put <char, rowIndex> pair into the map
8            }
9        }
10        List<String> res = new LinkedList<>();
11        for(String w: words){
12            if(w.equals("")) continue;
13            int index = map.get(w.toUpperCase().charAt(0));
14            for(char c: w.toUpperCase().toCharArray()){
15                if(map.get(c)!=index){
16                    index = -1; //don't need a boolean flag. 
17                    break;
18                }
19            }
20            if(index!=-1) res.add(w);//if index != -1, this is a valid string
21        }
22        return res.toArray(new String[0]);
23    }
24}