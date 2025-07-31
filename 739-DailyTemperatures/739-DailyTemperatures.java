// Last updated: 7/31/2025, 2:12:43 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<temperatures.length;i++) {
			while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]) {
				int prevIndex = st.pop(); // Pop the index of the previous cooler temperature
                ans[prevIndex] = i - prevIndex;
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=0;
		}
		return ans;
	}  
}