// Last updated: 7/31/2025, 2:13:57 PM
class Solution {
    public int missingNumber(int[] nums) {
        return missing(nums);
    }
    public static int missing(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        //actual sum;
        int ac_sum=(arr.length*(arr.length+1))/2;
        int missing_no=ac_sum-sum;
        return missing_no;
    }
}