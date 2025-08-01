// Last updated: 7/31/2025, 2:11:08 PM
class Solution {
    public String smallestNumber(String pattern) {
        return construct(pattern);
    }
    public static String construct(String str) {
		int[] ans=new int[str.length()+1];
		int c=1;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()]=c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		String s="";
		for(int v:ans) {
			s+=v;
		}
		return s;
	}
}