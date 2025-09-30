// Last updated: 9/30/2025, 6:10:00 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        return histogram(heights);
    }
    public static int histogram(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					ans=Math.max(h*r, ans);
				}
				else {
					int l=st.peek();
					int area=h*(r-l-1);
					ans=Math.max(area, ans);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty() ) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				ans=Math.max(h*r, ans);
			}
			else {
				int l=st.peek();
				int area=h*(r-l-1);
				ans=Math.max(area, ans);
			}
		}
		return ans;
	}
}