// Last updated: 7/31/2025, 2:15:28 PM
class Solution {
    public String simplifyPath(String path) {
        Stack <String> st=new Stack<>();
        String[] parts=path.split("/");
        for(int i=0;i<parts.length;i++){
            if (parts[i].equals("") || parts[i].equals(".")) continue;

            if (!parts[i].equals("..")) {
                st.push(parts[i]);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        String result = "";
        if(st.isEmpty()) return "/";
        while(!st.empty()){ // add all the stack elements
            result="/"+st.pop()+result;
        }
        return result;
    }
}