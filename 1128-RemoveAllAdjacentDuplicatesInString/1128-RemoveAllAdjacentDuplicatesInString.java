// Last updated: 7/31/2025, 2:12:00 PM
class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() || st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        String res = "";
        while (!st.isEmpty()) {
            res = st.pop() + res;
        }

        return res;
    }
}