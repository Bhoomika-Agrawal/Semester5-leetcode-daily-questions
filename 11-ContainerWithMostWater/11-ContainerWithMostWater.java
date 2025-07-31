// Last updated: 7/31/2025, 2:16:17 PM
class Solution {
    public int maxArea(int[] height) {
        return maxarea(height);
    }
    public static int maxarea(int[] height){
        int start=0;
        int last=height.length-1;
        int max=0;
        while(start<last){
            int lh=height[start];
            int rh=height[last];
            int min_height=Math.min(lh,rh);
            max=Math.max(max,min_height*(last-start));
            if(lh>rh){
                last--;
            }
            else{
                start++;
            }
        }
         return max;
    }
}