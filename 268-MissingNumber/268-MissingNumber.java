// Last updated: 25/09/2026, 07:48:48
1class Solution {
2    public int findComplement(int num) 
3    {
4        int i = 0;
5        int j = 0;
6        
7        while (i < num)
8        {
9            i += Math.pow(2, j);
10            j++;
11        }
12        
13        return i - num;
14    }
15}