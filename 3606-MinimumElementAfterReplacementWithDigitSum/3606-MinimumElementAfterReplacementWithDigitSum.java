// Last updated: 7/31/2025, 2:10:58 PM
class Solution {
    public int minElement(int[] nums) {
        int min_val = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=digit(nums[i]);
            min_val=Math.min(min_val,sum);
        }
        return min_val;
    }
    public static int digit(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
}