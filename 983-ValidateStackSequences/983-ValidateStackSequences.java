// Last updated: 7/31/2025, 2:12:08 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> st=new Stack<>();
        int i=0,j=0;
        while(i<pushed.length && j<popped.length){
            st.push(pushed[i]);
            while(!st.isEmpty() && j<popped.length && st.peek()==popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty();
    }
}