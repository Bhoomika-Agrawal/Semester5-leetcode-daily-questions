// Last updated: 7/31/2025, 2:14:52 PM
class Solution {
    public int singleNumber(int[] nums) {
        return single(nums);
    }
    public static int single(int[] arr){
        int value=0;
        for(int i=0;i<arr.length;i++){
            value=value^arr[i];
        }
        return value;
    }
}