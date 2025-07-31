// Last updated: 7/31/2025, 2:12:45 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
                int sum=asteroids[i]+st.peek();
                if(sum<0){
                    st.pop();
                }
                else if(sum>0){
                    asteroids[i]=0;
                    break;
                }
                else{
                    st.pop();
                    asteroids[i]=0;
                    break;
                }
            }
            if(asteroids[i]!=0){
                st.push(asteroids[i]);
            }
        }
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}