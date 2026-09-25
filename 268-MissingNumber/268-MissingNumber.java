// Last updated: 25/09/2026, 07:42:48
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result = new ArrayList<>();
4        
5        for (int hour = 0; hour < 12; hour++) {
6            
7            for (int minute = 0; minute < 60; minute++) {
8                
9                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);
10                
11                if (totalBits == turnedOn) {
12                    
13                    String time = hour + ":" + 
14                                  (minute < 10 ? "0" + minute : minute);
15                    
16                    result.add(time);
17                }
18            }
19        }
20        
21        return result;
22    }
23}