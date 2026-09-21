// Last updated: 21/09/2026, 22:05:08
1class Solution {
2    public int longestValidParentheses(String s) {
3        if(s.equals("")){
4            return 0;
5        }
6
7        Stack<Integer> st = new Stack<>();
8        st.push(-1);
9
10        int max_len = 0;
11
12        for(int i=0;i<s.length();i++){
13            if(s.charAt(i) == '('){
14                st.push(i);
15            }
16            else{
17                st.pop();
18                if(st.isEmpty()){
19                    st.push(i);
20                }
21                else{
22                    max_len = Math.max(max_len,i - st.peek());
23                }
24            }
25        }
26        return max_len;
27    }
28}