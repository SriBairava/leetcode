// Last updated: 21/09/2026, 22:27:52
1class Solution {
2    List<String> results;
3    HashSet<String> dict;
4    public List<String> wordBreak(String s, List<String> wordDict) {
5        results = new ArrayList<>();
6        dict = new HashSet<String>();
7        for(String word: wordDict)dict.add(word);
8        backTrack(s,0,new StringBuilder());
9        return results;
10        
11    }
12    
13    public void backTrack(String s, int start, StringBuilder currentSentence){
14        if(start==s.length()) results.add(currentSentence.toString().trim());
15        for(int i = start; i<s.length();i++){
16            if(dict.contains(s.substring(start,i+1))) {
17                int len = currentSentence.length();
18                currentSentence.append(s.substring(start,i+1));
19                currentSentence.append(" ");
20                backTrack(s,i+1,currentSentence);
21                currentSentence.setLength(len);
22            }
23        }
24    }
25}