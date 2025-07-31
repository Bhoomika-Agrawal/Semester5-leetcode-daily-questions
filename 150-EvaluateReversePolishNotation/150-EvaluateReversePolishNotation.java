// Last updated: 7/31/2025, 2:14:47 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            if(token.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(token.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(token.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(token.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}