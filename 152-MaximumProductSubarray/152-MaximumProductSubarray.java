// Last updated: 7/31/2025, 2:14:44 PM
class Solution {
    public int maxProduct(int[] nums) {
        return max(nums);
    }
    public static int max(int[] arr){
        int ans=Integer.MIN_VALUE;
        int pre=1;
        int suff=1;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }
            pre=pre*arr[i];
            suff=suff*arr[n-1-i];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
}