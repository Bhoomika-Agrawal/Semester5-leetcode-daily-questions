// Last updated: 7/31/2025, 2:13:28 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k-->0){
            st.pop();
        }
        StringBuilder res=new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
}